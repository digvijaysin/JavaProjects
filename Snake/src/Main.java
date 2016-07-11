import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

/**
 * Created by SHIVANSHU on 29/06/2016.
 */
public class Main implements KeyListener{
    private static int x=0;
    private static int y=0;
    private static int xval=0;
    private static int yval=0;
    private static int height=10;
    private static int width=10;
    public static void main(String[] args) {
        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setSize(600, 600);
       // frame1.setBackground(Color.black);
        frame1.setVisible(true);
        JPanel panel1 = new JPanel();
        frame1.setContentPane(panel1);
        panel1.setBackground(Color.black);
        panel1.setFocusable(true);
        panel1.requestFocus();
        panel1.addKeyListener(new Main());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Random random = new Random();
        Graphics graphics = panel1.getGraphics();
        Image image=null;
        try {
            URL url1 = new URL("Main/Image/IMG_20151030_102418.png");
        ImageIO.read(url1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        x = random.nextInt(590);
        y = random.nextInt(590);
        graphics.setColor(Color.green);
        graphics.fillOval(x, y, 10, 10);
        while (true) {
            if (xval == x || yval == y) {
                height = height + 10;
                width = width + 10;
                x = random.nextInt(590);
                y = random.nextInt(590);
            } else {

                graphics.clearRect(0, 0, 600, 600);
                graphics.drawImage(image,600,600,null);
                graphics.setColor(Color.green);
                graphics.fillOval(x, y, 10, 10);

                graphics.setColor(Color.yellow);

                graphics.fillOval(xval, yval, height, width);
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            if(Main.xval==590)
            {
                Main.xval=0;
            }
            else {
                Main.xval = Main.xval + 1;
                Main.yval = Main.yval + 0;
            }
        } else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
            if(Main.xval==0)
            {
                Main.xval=Main.xval+590;
            }
            else
            {
                Main.xval=Main.xval-1;
                Main.yval=Main.yval+0;

            }

        }
        else if(e.getKeyCode()==KeyEvent.VK_DOWN)
        {
            if(Main.yval==590)
            {
                Main.yval=Main.yval-590;
            }
            else {
                Main.xval = Main.xval + 0;
                Main.yval = Main.yval + 1;
            }
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP)
        {
            if(Main.yval==0)
            {
                Main.yval=Main.yval+590;
            }
            else
            {
                Main.xval=Main.xval+0;
                Main.yval=Main.yval-1;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
