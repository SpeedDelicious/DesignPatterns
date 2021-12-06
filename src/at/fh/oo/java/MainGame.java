package at.fh.oo.java;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

   private List<Actor> actors;


    public MainGame(String title) {
        super(title);
    }



    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors){
            actor.render(graphics);
        }
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.actors = new ArrayList<>();
        MoveStrategy mr1 = new MoveRight(0,0,0.3f);
        MoveStrategy ml1 = new MoveLeft(700,100,0.2f);
        MoveStrategy mr2 = new MoveRight(40,40,0.4f);

        this.actors.add(new CircleActor(mr1));
        this.actors.add(new CircleActor(ml1));
        this.actors.add(new RectangleActor(mr2));
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors){
            actor.update(gameContainer, delta);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Testgame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
