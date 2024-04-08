package edu.handong.csee.java.encapsulation;

/**
 * importing other subclasses in different directory
 */
import edu.handong.csee.java.encapsulation.shapes.Point;
import edu.handong.csee.java.encapsulation.shapes.Rectangle;

/**
 * This class is main class to create rectangle objects and use move functions to reset rect.
 */
public class CreateObjectDemonstrator {
    /**
     * This is a constructor for CreateObjectDemonstartor
     */
    public CreateObjectDemonstrator(){

    }

    /**
     * main to run program
     * @param args  for running
     */
    public static void main(String[] args) {
        /**
         * This is to create instance to run
         */
        CreateObjectDemonstrator myRunner = new CreateObjectDemonstrator();

        myRunner.run();
    }

    /**
     * to run program.
     */
    public void run() {
        /**
         * Declare and create a point object and two rectangle objects.
        */
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
        /**
         * Show rectOne's width, height, and area
        */
        
        System.out.println("Width of rectOne: " + rectOne.getWidth);
        System.out.println("Height of rectOne: " + rectOne.getHeight);
        System.out.println("Area of rectOne: " + rectOne.getArea());

        /**
         * set rectTwo position
         */
        rectTwo.setOrigin = originOne;

        /**
         * shows rectTwo's position x and y
         */
        System.out.println("X Position of rectTwo: " + rectTwo.getOrigin().getX());
        System.out.println("Y Position of rectTwo: " + rectTwo.getOrigin().getY());

        /**
         * moving rectTwo and show its new position
         */
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.getOrigin().getX());
        System.out.println("Y Position of rectTwo: " + rectTwo.getOrigin().getY());
    }
}
