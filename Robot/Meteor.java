import java.awt.*;
import java.util.Random;

public class Meteor {
    public static final int SIZE = 50;
    private int x;
    private int y;

    public Meteor (int x) {
        this.x = x;
        this.y = new Random().nextInt(-200, 0);
    }

    public void fall () {
        this.y++;
        if (this.y >= Window.HEIGHT) {
            this.x = new Random().nextInt(0, Window.WIDTH);
            this.y = new Random().nextInt(-200, 0);
        }
    }

    public void paint (Graphics graphics) {
        graphics.setColor(Color.magenta);
        graphics.fillOval(this.x, this.y, SIZE, SIZE);
    }

    public Rectangle getMeteorAsRectangle () {
        return new Rectangle(
                this.x,
                this.y,
                SIZE,
                SIZE
        );
    }
}
