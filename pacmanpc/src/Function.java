import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by SHIVANSHU on 28/06/2016.
 */
public class Function {
    public Function()
    { int j;
        JFrame fram1 = new JFrame("PACMANPC");
        fram1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fram1.setSize(600, 600);
        fram1.setResizable(false);
        JPanel panel1 = new JPanel();
        // panel1.setPreferredSize();
        fram1.setContentPane(panel1);
        fram1.setBackground(Color.black);
        fram1.setVisible(true);


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Graphics graphics1 = panel1.getGraphics();

        for (int i = 0; i <= 235; i++) {
            graphics1.clearRect(0, 0, 600, 600);
            graphics1.drawLine(0,50,185,235);
            graphics1.drawLine(50,0,285,235);
            graphics1.drawLine(550,0,285,235);
            graphics1.drawLine(600,50,385,235);
            graphics1.drawLine(0,550,185,235);
            graphics1.drawLine(50,600,185,385);
            graphics1.drawLine(550,600,385,385);
            graphics1.drawLine(600,550,385,235);
            if(i%2==0) {

                graphics1.setColor(Color.red);

                graphics1.setColor(Color.green);
                graphics1.fillArc(0 + i, 0 + i, 50, 50, 0, 270);
                graphics1.setColor(Color.red);
                graphics1.fillArc(0 + i, 520 - i, 50, 50, 90, 270);
                graphics1.setColor(Color.blue);
                graphics1.fillArc(540 - i, 520 - i, 50, 50, 180, 270);
                graphics1.setColor(Color.orange);
                graphics1.fillArc(540 - i, 0 + i, 50, 50, 270, 270);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else
            {

                graphics1.setColor(Color.red);
                graphics1.fillArc(0 + i, 0 + i, 50, 50, 0, 360);
                graphics1.setColor(Color.green);
                graphics1.fillArc(0 + i, 520 - i, 50, 50, 0, 360);
                graphics1.setColor(Color.orange);
                graphics1.fillArc(540 - i, 520 - i, 50, 50, 0, 360);
                graphics1.setColor(Color.blue);
                graphics1.fillArc(540 - i, 0 + i, 50, 50, 0, 360);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        for ( j = 235; j >= 0; j--)
        {
            graphics1.clearRect(0, 0, 600, 600);
            graphics1.drawLine(0,50,185,235);
            graphics1.drawLine(50,0,285,235);
if(j%2==0) {
    graphics1.setColor(Color.green);
    graphics1.fillArc(0 + j, 0 + j, 50, 50, 180, 270);
    graphics1.setColor(Color.red);
    graphics1.fillArc(0 + j, 520 - j, 50, 50, 270, 270);
    graphics1.setColor(Color.blue);
    graphics1.fillArc(540 - j, 520 - j, 50, 50, 0, 270);
    graphics1.setColor(Color.orange);
    graphics1.fillArc(540 - j, 0 + j, 50, 50, 90, 270);
}
else
            {
                graphics1.setColor(Color.red);
                graphics1.fillArc(0 + j, 0 + j, 50, 50, 0, 360);
                graphics1.setColor(Color.green);
                graphics1.fillArc(0 + j, 520 - j, 50, 50, 0, 360);
                graphics1.setColor(Color.orange);
                graphics1.fillArc(540 - j, 520 - j, 50, 50, 0, 360);
                graphics1.setColor(Color.blue);
                graphics1.fillArc(540 - j, 0 + j, 50, 50, 0, 360);
            }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


        }

    }
}


