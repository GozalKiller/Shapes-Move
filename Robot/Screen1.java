import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Screen1 extends JPanel {
    private ArrayList<Meteor> meteorList;
    private Robot robot;
    public static final int MAX_METEORS = 20;

    public Screen1 (int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        this.setBackground(Color.WHITE);
        this.meteorList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < MAX_METEORS; i++) {
            this.meteorList.add(new Meteor(random.nextInt(width)));
        }
        this.robot = new Robot();
        this.mainGameLoop();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Meteor meteor : this.meteorList) {
            meteor.paint(g);
        }
        this.robot.paint(g);
    }

    public void mainGameLoop () {
        new Thread(() -> {
            while (true) {
                try {
                    for (Meteor meteor : this.meteorList) {
                        meteor.fall();
                    }
                    if (!this.robot.isAlive()) {
                        this.robot.dissmenal();
                    }
                    checkCollision ();
                    repaint();
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    private boolean checkCollision () {
        boolean collision = false;
        for (Meteor meteor : this.meteorList) {
            if (meteor.getMeteorAsRectangle().intersects(this.robot.getRobotAsRectangle())) {
                collision = true;

            }
        }
        if (collision) {
            this.robot.die();
        }

        return collision;
    }

}
