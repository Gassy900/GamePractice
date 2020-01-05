import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

public class GameLauncher extends StateBasedGame {

    public GameLauncher(String title) {
        super(title);
    }
    
    public void initStatesList(GameContainer gc) throws SlickException {
       this.addState(new IntroScreen());
       this.addState(new MainGame());
       this.addState(new GameOverScreen());
      
    }

    public static void main(String args[]) throws SlickException {
        GameLauncher game = new GameLauncher("Diamond Hunter");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(800, 640, false);
        app.setShowFPS(false);
        app.setTargetFrameRate(100);
        app.start();
    }

}

