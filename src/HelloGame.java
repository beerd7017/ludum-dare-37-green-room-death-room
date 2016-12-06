/**
 * Created by deste on 12/06/16.
 */
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class HelloGame extends StateBasedGame {

    public static final String gamename = "Ludum Dare 37";
    public static final int play = 0;
    public static final int xSize = 400;
    public static final int ySize = 300;

    public HelloGame(String gamename){
        super(gamename);
        this.addState(new Play());
    }

    public void initStatesList(GameContainer gc) throws SlickException{
        this.getState(play).init(gc, this);
        this.enterState(play);
    }

    public static void main(String[] args) {
        AppGameContainer appgc;
        try{
            appgc = new AppGameContainer(new HelloGame(gamename));
            appgc.setDisplayMode(xSize, ySize, false);
            appgc.setTargetFrameRate(60);
            appgc.start();
        }catch(SlickException e){
            e.printStackTrace();
        }
    }
}
