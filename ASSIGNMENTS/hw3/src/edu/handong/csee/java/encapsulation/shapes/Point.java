package edu.handong.csee.java.encapsulation.shapes;

/**
 * setting point in this class
 */
public class Point {
    /**
     * x is rect's x point
     */
    private int x = 0;
    /**
     * y is rect's y point
     */
    private int y = 0;
    
    /**
     * this is a constructor to make points of the rectangle
     * @param a x point
     * @param b y point
     */
    public Point(int a, int b) {
        x = a;
        y = b;
    }

    /**
     * getter for x
     * @return x
     */
    public int getX() {
        return x;
    }


    /**
     * getter for y
     * @return y
     */
    public int getY() {
        return y;
    }


    /**
     * to resize rectangle
     * @param x
     * @param y
     */
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

