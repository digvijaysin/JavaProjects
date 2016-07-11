import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by SHIVANSHU on 28/06/2016.
 */
public class Game implements ActionListener{
  private static  JButton button1;
    private static  JButton button2;
    private static  JButton button3;
    private static  JButton button4;
        public static void main(String[] args) {

            Game game= new Game();
            JFrame fram1 = new JFrame("PACMANPC");
            fram1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            fram1.setSize(600, 600);
            fram1.setResizable(false);
            JPanel panel1 = new JPanel();
            // panel1.setPreferredSize();
            fram1.setContentPane(panel1);
panel1.setBackground(Color.black);

            fram1.setVisible(true);
       game.button1 = new JButton("     S T A R T     ");
            game.button2 = new JButton("     S E T T I N G    ");
            game.button3 = new JButton("     H E L P     ");
            game.button4 = new JButton("     Q U I T     ");
game.button1.setSize(100,200);
            panel1.add(button1).setLocation(200,300);
            panel1.add(button2).setLocation(200,400);
            panel1.add(button3).setLocation(200,500);
            panel1.add(button4).setLocation(200,600);
            game.button1.addActionListener(game);

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1)
        {
            Function function= new Function();
        }

    }
}

