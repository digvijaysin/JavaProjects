package Game;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;

/**
 * Created by SHIVANSHU on 06/07/2016.
 */
public class Resources {

        public static Image ballonImage;
        public static Image bombImage;
        public static Image gameOverImage;
        public static AudioClip burstAudio;
    public static AudioClip buffer;
    public static AudioClip startaudio;
    public static Image playbutton;
    public static Image pointreducebutton;
    public static Image pausebutton;
    public static Image backbutton;
    public static Image actionbutton;
    public static Image starbutton;
    public static Image settingbutton;
    public static Image exitbutton;
    public static Image looser;
    public static Image retry;
    public static Image levelimage;
        private Resources(){}

        public static void load() {
            try {
                Resources.ballonImage = ImageIO.read(Resources.class.getResource("Images/ballon.png"));
                Resources.gameOverImage = ImageIO.read(Resources.class.getResource("Images/looser.png"));
                Resources.bombImage = ImageIO.read(Resources.class.getResource("Images/haunted balloon image.png"));
                Resources.burstAudio = Applet.newAudioClip(Resources.class.getResource("Audio/hit.wav"));
                Resources.buffer = Applet.newAudioClip(Resources.class.getResource("Audio/fire_bow_sound-mike-koenig.wav"));
                Resources.startaudio = Applet.newAudioClip(Resources.class.getResource("Audio/Metroid_Door-Brandino480-995195341.wav"));
            Resources.playbutton=ImageIO.read(Resources.class.getResource("Images/play button.png"));
                Resources.pointreducebutton=ImageIO.read(Resources.class.getResource("Images/Bingo_Battle_Bomb_icon.png"));
                Resources.pausebutton=ImageIO.read(Resources.class.getResource("Images/playbutton.png"));
                Resources.backbutton=ImageIO.read(Resources.class.getResource("Images/bubblestart.png"));
                Resources.actionbutton=ImageIO.read(Resources.class.getResource("Images/ACTION.png"));
                Resources.starbutton=ImageIO.read(Resources.class.getResource("Images/star.png"));
                Resources.settingbutton=ImageIO.read(Resources.class.getResource("Images/setting.png"));
                Resources.exitbutton=ImageIO.read(Resources.class.getResource("Images/exit.png"));
                Resources.levelimage=ImageIO.read(Resources.class.getResource("Images/bacgroundimage1.png"));
                Resources.retry = ImageIO.read(Resources.class.getResource("Images/retrybutton.png"));
                Resources.looser=ImageIO.read(Resources.class.getResource("Images/gameover.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


