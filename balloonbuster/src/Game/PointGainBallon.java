package Game;

import java.util.Random;

/**
 * Created by SHIVANSHU on 06/07/2016.
 */
public class PointGainBallon extends Element{
    //private int p;
   // private Random random=new Random();
    public PointGainBallon(int x, int y) {
        super(x, y, 128, 128);
//  this.
        this.image=Resources.playbutton;
        this.yVel = -7;
    }

    @Override
    public void update() {
        super.update();

        if (this.y < -128) {
            this.y = 800;
            this.hidden = false;
            this.x = Util.randomInt(0, 472);
        }
    }
}


