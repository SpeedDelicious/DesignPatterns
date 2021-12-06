package at.fh.oo.java;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public abstract class AbstractActor implements Actor{
    protected MoveStrategy moveStrategy;

    public AbstractActor(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        moveStrategy.update(delta);
    }


}
