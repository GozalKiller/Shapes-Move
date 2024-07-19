public class MyRectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public MyRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void moveRight () {
        this.x++;
    }

    public void moveLeft () {
        this.x--;
    }

    public void moveUp () {
        this.y--;
    }

    public void moveDown () {
        this.y++;
    }


}
