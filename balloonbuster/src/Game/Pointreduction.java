package Game;

/**
 * Created by SHIVANSHU on 06/07/2016.
 */
public class Pointreduction extends Element{
    public Pointreduction(int x, int y) {
        super(x, y, 128, 128);

        this.image = Resources.pointreducebutton;
        //  this.
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

