import javax.swing.*;
import java.awt.*;

/** 
 * File: ExampleT1.java
 * U.Wolz 1999
 * For Assignment 3, CMSC 230, The College of New Jersey. All rights reserved.
 * This code may be used if properly acknowledged.
 */
public class TurtleTester {
  public static void main(String[] args) {
    // sets up panel (gui), including drawings on panel
    JPanel panel = new JPanel() {
      public void paintComponent(Graphics g) { 
        // creates a new DrawTurtle object
        DrawTurtle myTurtle = new DrawTurtle(this, g);
    
        // sets the turtle's location at 0, 0, current heading to 0 (up), and pen state to true (down)
        myTurtle.home();
    
        // runs hexagon method in DrawTurtle
        // myTurtle.hexagon(40);
        
        // runs freeForm method in DrawTutrle
//        myTurtle.freeForm();
    
        // runs squiral method in DrawTurtle (you may add parameters as needed)
//        myTurtle.squiral();

        // runs fractal tree method in DrawTurtle (you may add parameters as needed)
//       myTurtle.fractalTree(400, 450, 12, 100, 90);
    
        // runs fractal method in DrawTurtle (you may add parameters as needed)
//        myTurtle.fractalTriangle(7, 800, 0, 0);
    
        // runs beehive method in DrawTurtle
//        myTurtle.beehive(10);
      }
    };
    panel.setPreferredSize(new Dimension(800, 800));

    // creates frame that holds the panel
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panel); // adds previously set up panel to the frame (screen)
    frame.pack();
  }
  
}