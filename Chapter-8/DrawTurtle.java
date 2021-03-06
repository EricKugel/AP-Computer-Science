import java.awt.Color;
import java.awt.Graphics;
import java.awt.Component;

/**
 * File: DrawTurtle.java
 * U.Wolz 1999
 * For Assignment 3, CMSC 230, The College of New Jersey. All rights reserved.
 * This code may be used if properly acknowledged.
 */
public class DrawTurtle extends Turtle {
  protected Graphics graphics = null;
  protected boolean penstate = true;
  protected int centerX = 0;
  protected int centerY = 0;
  protected Color color = Color.BLACK;
  private final static int HEXAGON_SIZE = 40;
  
  public void home() {
    currentX = 0;
    currentY = 0;
    currentHeading = 0;
    penstate = true;
  }
  
  public DrawTurtle(Component comp, Graphics g) {
    this.graphics = g;
    centerX = comp.getSize().width / 2;
    centerY = comp.getSize().height / 2;
  }
  
  public void setColor(Color color) {
    this.color = color;
  }
  
  public Color getColor() {
    return color;
  }
  
  public void penDown() { 
    penstate = true;
  }
  
  public void penUp() {
    penstate = false;
  }
  
  public void forward(double distance) {
    double newX = currentX + distance * Math.sin(currentHeading * Math.PI / 180);
    double newY = currentY + distance * Math.cos(currentHeading * Math.PI / 180);
    if (penstate) {
      Color temp = graphics.getColor();
      graphics.setColor(color);
      graphics.drawLine((int) currentX + centerX, centerY - (int) currentY, (int) newX + centerX, centerY - (int) newY);
      graphics.setColor(temp);
    }
    currentX = newX;
    currentY = newY;
  }
  
  /**
   * Draws a free form practice drawing.
   */
  public void freeForm() {
    
  }
  
  
  /**
   * Draws a squiral (square spiral).
   */
  public void squiral() {
    home();
    for (int i = 0; i < 22; i++) {
      forward(i * 30);
      right(90);
    }
  }
  
  
  /** 
   * Draws a fractal tree using recursion.
   * You may add parameters as needed.
   */
  public void fractalTree(int x, int y, int level, int sideLength, double angle) {
    if (level == 12) {
      graphics.setColor(new Color(163, 131, 109));
      graphics.fillPolygon(new int[] {385, 400, 415}, new int[] {800, 437, 800}, 3);
      fractalTree(x, y, level - 1, sideLength, angle);
    }  else if (level == 1) {
      graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), 0));
      graphics.fillOval(x, y, 6, 6);
      graphics.setColor(new Color(163, 131, 109));
      return;
    }

    for (int i : new int[] {1, -1}) {
      double theta = angle + (28 * i);
      int x1 = (int) (x  + Math.cos(Math.toRadians(theta)) * sideLength);
      int y1 = (int) (y - Math.sin(Math.toRadians(theta)) * sideLength);
      graphics.drawLine(x, y, x1, y1);
      fractalTree(x1, y1, level - 1, (int) (sideLength * .8), theta);
    }
  }
  
  /** 
   * Draws a Sierpinski triangle using recursion.
   * You may add parameters as needed.
   */
  public void fractalTriangle(int level, int length, int x, int y) {
    if (level == 0) {
      return;
    }
    
    graphics.setColor(new Color((int) (255 * (double) level / 7), 110, 70));
    if (level == 7) {
      graphics.fillPolygon(new int[] {0, length / 2, length}, new int[] {length, 0, length}, 3);
    }
    
    graphics.fillPolygon(new int[] {x + length / 4, x + length * 3 / 4, x + length / 2}, new int[] {y + length / 2, y + length / 2, y + length}, 3);
    
    fractalTriangle(level - 1, length / 2, x, y + length / 2);
    fractalTriangle(level - 1, length / 2, x + length / 4, y);
    fractalTriangle(level - 1, length / 2, x + length / 2, y + length / 2);
  }
    
  /** 
   * Draws a beehive using recursion.
   *
   * @param level   the number of iterations (rings) in the beehive
   * @param length  the length of each side of the hexagons
   */
  public void beehive(int level) {
    if (level == 0) {
      hexagon(400, 400);
    } else {
      int x = 400;
      int y = 400 - level * HEXAGON_SIZE;
      int[] xChanges = {HEXAGON_SIZE * 3 / 4, 0, HEXAGON_SIZE * 3 / -4, HEXAGON_SIZE * 3 / -4, 0, HEXAGON_SIZE  * 3 / 4};
      int[] yChanges = {HEXAGON_SIZE / 2, HEXAGON_SIZE, HEXAGON_SIZE / 2, HEXAGON_SIZE / -2, -1 * HEXAGON_SIZE, HEXAGON_SIZE / -2};
      for (int i = 0; i < xChanges.length; i++) {
        for (int j = 0; j < level; j++) {
          hexagon(x, y);
          x += xChanges[i];
          y += yChanges[i];
        }
      }
      beehive(level - 1);
    }
  }
  
  public void hexagon(int centerX, int centerY) {
    graphics.setColor(Color.YELLOW);
    graphics.fillPolygon(new int[] {centerX - HEXAGON_SIZE / 4, centerX + HEXAGON_SIZE / 4, centerX + HEXAGON_SIZE / 2, centerX + HEXAGON_SIZE / 4, centerX - HEXAGON_SIZE / 4, centerX - HEXAGON_SIZE / 2},
                         new int[] {centerY - HEXAGON_SIZE / 2, centerY - HEXAGON_SIZE / 2, centerY, centerY + HEXAGON_SIZE / 2, centerY + HEXAGON_SIZE / 2, centerY}, 6); 
    graphics.setColor(Color.BLACK);
    graphics.drawPolygon(new int[] {centerX - HEXAGON_SIZE / 4, centerX + HEXAGON_SIZE / 4, centerX + HEXAGON_SIZE / 2, centerX + HEXAGON_SIZE / 4, centerX - HEXAGON_SIZE / 4, centerX - HEXAGON_SIZE / 2},
                         new int[] {centerY - HEXAGON_SIZE / 2, centerY - HEXAGON_SIZE / 2, centerY, centerY + HEXAGON_SIZE / 2, centerY + HEXAGON_SIZE / 2, centerY}, 6); 
  }
  
}

