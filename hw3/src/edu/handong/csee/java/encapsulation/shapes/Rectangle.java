package edu.handong.csee.java.encapsulation.shapes;

/**
 * Setting Rectangle's postion and move the object's points as well and getting area of the rectangle
 */
public class Rectangle {
    /**
     * default setting of width
     */
    public int width = 0;
    /**
     * default setting of height
     */
    public int height = 0;

    /**
     * default setting of origin
     */
    public Point origin;

    /**
     * Constructing Default value of 0,0
     *  
     * */ 
    public Rectangle() {
        origin = new Point(0, 0);
    }

    /**
     * Constructing setting points
     * @param p getting points from its class
     */
    public Rectangle(Point p) {
        origin = p;
    }

    /**
     * Constructing setting rect's position
     * @param w width
     * @param h height
     */
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    /**
     * Constructing setting origin one to new one
     * @param p original point
     * @param w width
     * @param h height
     */
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    /**
     * a method for moving the rectangle
     * @param x setting new x
     * @param y setting new y
     */
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    /**
     * a method for computing the area of the rectangle
     * @return area returned
     */
    public int getArea() {
        return width * height;
    }
}

