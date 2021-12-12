package at.fh.oo.java;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class RectangleActor extends AbstractActor{

    private Color color;

    public RectangleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawRect(this.moveStrategy.getX(), this.moveStrategy.getY(),20,20);
        graphics.setColor(Color.white);
    }

    public void inform(){
        this.color = Color.orange;
    }
}
