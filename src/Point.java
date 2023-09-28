public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int num) {
        this.x = num;
        this.y = num;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int newX) {
        this.x = newX;
    }
    public void setX(int newY) {
        this.y = newY;
    }
    public String coordinate() {
        return "(" + this.x + "," + this.y + ")";
    }
    public void string() {}
}
