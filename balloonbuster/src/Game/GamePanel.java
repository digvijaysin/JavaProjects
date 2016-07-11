package Game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.*;


/**
 * Created by SHIVANSHU on 06/07/2016.
 */

    public class GamePanel extends JPanel implements MouseListener, Runnable {

    private Image image;
    private List<Element> elements=new ArrayList<>();
    public int score = 0;
    private boolean gameOver = false;
    private boolean pause=false;
    private static  int j=0;
    private boolean start=true;
    private static int k=0;
    private static int l=0;
    private boolean cond =true;
    public static int level = 1;
    private static int i=0;

    public GamePanel() {
        super();

        this.setPreferredSize(new Dimension(600, 700));
        this.addMouseListener(this);
    }



       // @Override
        public void addNotify() {
            super.addNotify();

           Resources.load();
            this.image = new BufferedImage(600, 700, BufferedImage.TYPE_INT_RGB);
            Thread thread = new Thread(this, "Game Thread");
            thread.start();
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            for (int i = 0; i < this.elements.size(); i++) {
                Element element = this.elements.get(i);
                if (j == 0&&l==0) {
                    if (element.wasClicked(e.getX(), e.getY())) {

                        if (element instanceof Balloon) {
                            Resources.buffer.play();
                            element.hidden = true;
                            this.score += 10;
                        } else if (element instanceof SuperBallon) {
                            //  if(this.score<100)
                            // {

                            //  }
                            // else
                            // {
                            this.gameOver = true;
                            Balloon.escapedCount=0;
                          //  this.cond=false;
                            Resources.burstAudio.play();
                            element.hidden = true;
                        } else if (element instanceof PointGainBallon) {
                            Resources.burstAudio.play();

                            element.hidden = true;
                            this.score += 50;
                        } else if (element instanceof Pointreduction) {
                            Resources.startaudio.play();
                            element.hidden = true;
                            this.score += -20;
                        }
                    }
                }
            }
            if (e.getX() > 0 && e.getX() < 40 && e.getY() > 0 && e.getY() < 40) {

                if (j == 0) {
                    j++;
                    this.pause = true;
                } else {
                    this.pause = false;
                    j--;
                }
            } else if (e.getX() > 200 && e.getX() < 400 && e.getY() > 220 && e.getY() < 350) {
                if (k == 0) {
                    k++;
                    Resources.startaudio.play();
                    Balloon.escapedCount=0;
                    start = !start;

                }
            }
            else if(e.getX()>99&&e.getX()<427&&e.getY()>600&&e.getY()<697)
            {if(l==1) {
                l=0;
                k--;
                start = !start;
                //cond=false;
               // Retry retry= new Retry();
                this.score=0;
                this.gameOver=!this.gameOver;
                Balloon.escapedCount=0;

            }
            }
        }


    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    @Override
        public void run() {


        this.elements = new ArrayList<>();
        this.elements.add(new Balloon(10, 800));
        this.elements.add(new Balloon(100, 600));
        this.elements.add(new Balloon(150, 900));
        this.elements.add(new Balloon(300, 1000));
        this.elements.add(new Balloon(400, 950));
        this.elements.add(new Balloon(20, 1200));
        this.elements.add(new SuperBallon(20, 1100));
        this.elements.add(new SuperBallon(450, 400));
        this.elements.add(new SuperBallon(300, 800));
        elements.add(new PointGainBallon(10, 1800));
        elements.add(new Pointreduction(10, 1500));

        while (cond) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (!pause) {
                Graphics imageGraphics = this.image.getGraphics();
                Graphics panelGraphics = this.getGraphics();
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while(start)
                { try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    imageGraphics.clearRect(0,0,600,700);
                    imageGraphics.setColor(Color.RED);
                    imageGraphics.drawImage(Resources.backbutton,0,0,null);
                    imageGraphics.drawImage(Resources.actionbutton,0,0,null);
                  //  imageGraphics.drawImage(Resources.starbutton,150,0,null);
                   // imageGraphics.drawImage(Resources.settingbutton,370,0,null);
                   // imageGraphics.drawImage(Resources.actionbutton,220,550,null);
                    imageGraphics.drawString("S T A R T",220,350);
                    imageGraphics.dispose();
                    panelGraphics.drawImage(image,0,0,null);
                    panelGraphics.dispose();
                    //Resources.burstAudio.play();
                }

                imageGraphics.clearRect(0, 0, 600, 700);
                imageGraphics.setColor(Color.cyan);
                imageGraphics.fillRect(0, 0, 600, 700);
                imageGraphics.setColor(Color.red);



                if (Balloon.escapedCount >= 10) {
                    this.gameOver = true;
                    Balloon.escapedCount=0;
                }

                if (this.gameOver) {
                    l=1;
                    imageGraphics.drawImage(Resources.gameOverImage,0,0, null);
                    imageGraphics.drawImage(Resources.looser, 350,0, null);
                    imageGraphics.drawImage(Resources.retry, 100,600, null);
                    imageGraphics.drawString("YOUR SCORE= "+score,400,400);

                    imageGraphics.dispose();
                    panelGraphics.drawImage(image, 0, 0, null);
                    panelGraphics.dispose();
                    break;
                }

            imageGraphics.drawImage(Resources.levelimage,0,0,600,700,null);
                imageGraphics.setColor(Color.yellow);
                imageGraphics.drawString("Score: " + Integer.toString(this.score), 500, 20);
                imageGraphics.drawString("BALLOON MISSED: " + Integer.toString(Balloon.escapedCount), 350, 20);
                imageGraphics.drawString("LEVEL: "+Integer.toString(this.level),200,20);
                imageGraphics.drawImage(Resources.pausebutton, 0, 0, null);
                // imageGraphics.drawString("SCOORE:"+ Integer.toString(this.score,20),500,20);
                if(this.score>300)
                {
                    level=2;
                    if(i==0) {
                        i = 1;
                        Resources.startaudio.play();
                    }
                }

                for (int i = 0; i < this.elements.size(); i++) {

                    Element element = this.elements.get(i);
                    element.update();
                    if (!element.hidden) {
                        // if(this.score%100==0) {


                        // }
                        //else

                        //  element.update();
                        imageGraphics.drawImage(element.image, element.x, element.y, null);


                    }

                    //else
                    //  {
                    //element.update();
                    //imageGraphics.drawImage(element.image, element.x, element.y, null);
                    //}
                    //}
                }

                imageGraphics.dispose();


                panelGraphics.drawImage(this.image, 0, 0, null);
               panelGraphics.dispose();

            }
          //  panelGraphics.drawImage(this.image, 0, 0, null);
          //  panelGraphics.dispose();


        }
    }

}
