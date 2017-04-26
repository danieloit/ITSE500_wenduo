package edu.oit.lesson4;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
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
    
    public double getDistanceFrom(Point p) {
        double distance = 0;
        int xDistance = this.x - p.getX();
        int yDistance = this.y - p.getY();
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }
    
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(20, 30);
        
        System.out.println(p1.getDistanceFrom(p2));
    }

}