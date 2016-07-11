package Game;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Image;import java.io.IOException;
/**
 * Created by SHIVANSHU on 06/07/2016.
 */


    abstract public class Element {

        public int x;
        public int y;
        public int xVel = 0;
        public int yVel= 0;
        public int xAcc = 0;
        public int yAcc = 0;
        public int width;
        public int height;
        public boolean hidden = false;
   // public int score=0;

        public Image image;


        public Element(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public void update() {
            this.xVel += this.xAcc;
            this.yVel += this.yAcc;
            this.x += this.xVel;
            if (GamePanel.level == 1)
                this.y += this.yVel;
            else {
                System.out.println("hello digvijay");
                this.y += this.yVel - 2;
            }
        }


        public boolean wasClicked(int xofClick, int yOfClick) {
            if(!this.hidden && xofClick > this.x && xofClick < (this.x + this.width) && yOfClick > this.y && yOfClick < (this.y + this.height)) {
                return true;
            }

            return false;
        }
    }


