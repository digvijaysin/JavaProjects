package Game;

/**
 * Created by SHIVANSHU on 06/07/2016.
 */

public class Balloon extends Element {

        public static int escapedCount = 0;

        public Balloon(int x, int y) {
            super(x, y, 128, 128);

            this.image = Resources.ballonImage;
yVel=-5;
        }

        @Override
        public void update() {
            super.update();

            if (this.y < -128) {
                if (!this.hidden) {
                    Balloon.escapedCount++;
                    System.out.println(Balloon.escapedCount);
                }
                this.y = 800;
                this.hidden = false;

                this.x = Util.randomInt(0, 472);
            }
        }
    }



