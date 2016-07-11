package Game;

import javax.swing.*;

/**
 * Created by SHIVANSHU on 06/07/2016.
 */

    public class Game {

        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            GamePanel panel = new GamePanel();

            frame.setContentPane(panel);
                  frame.pack();
            frame.setVisible(true);
        }
    }


