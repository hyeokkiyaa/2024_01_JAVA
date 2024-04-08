package edu.handong.csee.java.encapsulation.shapes;

/**
 * Setting Rectangle's postion and move the object's points as well and getting area of the rectangle
 */
public class Rectangle {
    /**
     * default setting of width
     */
    private int width = 0;
    /**
     * default setting of height
     */
    private int height = 0;

    /**
     * default setting of origin
     */
    private Point origin;

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
     */
    public void move(int x, int y) {
        origin.move(x,y);
    }

    /**
     * a method for computing the area of the rectangle
     * @return
     */
    public int getArea() {
        return width * height;
    }

    /**
     * getter for width
     * @return width
     */
    public int getWidth() {
        return width;
    }

    /**
     * getter for height 
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * getter for origin point
     * @return origin object
     */
    public Point getOrigin() {
        return origin;
    }
}

