import org.newdawn.slick.*;

public class Terrian_Test extends BasicGame {

 Terrian map;
public Terrian_Test (String title) {
super(title);
}

public void init(GameContainer gc) throws SlickException {
    map = new Terrian();
}

public void update(GameContainer gc, int i) throws SlickException {

}

public void render(GameContainer gc, Graphics g) throws SlickException {
    map.draw();
    map.drawGrid(g);
}

public static void main(String args[]) throws SlickException {
  Terrian_Test game = new Terrian_Test("Testing Game");
  AppGameContainer app = new AppGameContainer(game);
  app.setDisplayMode(800, 600, false);
  app.setShowFPS(false);
  app.setTargetFrameRate(100);
  app.start();
}

}
