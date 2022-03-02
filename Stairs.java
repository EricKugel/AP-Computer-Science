import javax.swing.*;
import java.awt.*;

public class Stairs {
  
  private static final int WIDTH = 300;
  private static final int HEIGHT = 400;
  
  public static void main (String[] arg0) {
    JFrame frame = new JFrame();
    frame.setVisible(true);
    JPanel panel = new JPanel() {
      public void paintComponent(Graphics g) {
        draw(g);
      }
    };
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    frame.add(panel);
    frame.pack();
  }
  
  private static void draw(Graphics g) {
    int x1 = 0;
    int y1 = HEIGHT;
    
  }
}