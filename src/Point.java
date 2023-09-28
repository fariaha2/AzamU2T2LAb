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
    public void setY(int newY) {
        this.y = newY;
    }
    public String coordinate() {
        return "(" + this.x + "," + this.y + ")";
    }
    public String quadrant() {
        String quadrant = null;
        if(x > 0 && y > 0) {
            quadrant = "I";
        } else if(x < 0 && y > 0) {
            quadrant = "II";
        } else if(x < 0 && y < 0) {
            quadrant = "III";
        } else if(x > 0 && y < 0) {
            quadrant = "IIII";
        } else if(x == 0 && y == 0) {
            quadrant = "the origin";
        } else if(x == 0 && y > 0) {
            quadrant = "on the y-axis";
        } else if(x == 0 && y < 0) {
            quadrant = "on the y-axis";
        } else if(x > 0 && y == 0) {
            quadrant = "on the x-axis";
        } else if(x < 0 && y == 0) {
            quadrant = "on the x-axis";
        }
        return quadrant;
    }
}
