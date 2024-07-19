import java.awt.*;

public class Robot {
    public static final int HEAD_SIZE = 30;
    public static final int BODY_SIZE = 70;
    private MyRectangle head;
    private MyRectangle body;
    private MyRectangle leftFoot;
    private MyRectangle rightFoot;
    private boolean alive;

    public Robot () {
        this.head = new MyRectangle(Window.WIDTH / 2, Window.HEIGHT / 2, HEAD_SIZE, HEAD_SIZE);
        this.body = new MyRectangle(
                this.head.getX() - (BODY_SIZE - HEAD_SIZE) / 2,
                this.head.getY() + HEAD_SIZE,
                BODY_SIZE,
                BODY_SIZE
        );
        this.alive = true;
    }

    public void paint (Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.fillRect(this.head.getX(), this.head.getY(),
                this.head.getWidth(), this.head.getHeight());
        graphics.fillRect(this.body.getX(), this.body.getY(),
                this.body.getWidth(), this.body.getHeight());
    }

    public Rectangle getRobotAsRectangle () {
        return new Rectangle(
                this.head.getX(),
                this.head.getY(),
                HEAD_SIZE,
                HEAD_SIZE
        );
    }

    public boolean isAlive () {
        return this.alive;
    }

    public void die () {
        this.alive = false;
    }


    public void dissmenal() {
        this.head.moveRight();
        this.head.moveUp();
        this.body.moveLeft();
        this.body.moveDown();
    }
}
