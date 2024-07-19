import javax.swing.*;

public class Window extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 600;

    public Window () {
        Screen1 screen1 = new Screen1(0, 0, WIDTH, HEIGHT);
        this.add(screen1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
    }
}
