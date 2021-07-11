package s6.ce32;

import static java.lang.Math.*;

public class Point {
    private int x;
    private int y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return sqrt(pow(this.x, 2) + pow(this.y, 2));
    }

    public double distance(int x, int y) {
        return sqrt(pow((this.x - x), 2) + pow((this.y - y), 2));
    }

    public double distance(Point another) {
        return sqrt(pow((this.x - another.x), 2) + pow((this.y - another.y), 2));

    }
}
