import javax.swing.*;
import java.awt.*;

public class Circles {
  private static int WIDTH = 400;
  private static int HEIGHT = 300;
  
  public static void main(String[] arg0) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);  
    frame.add(new JPanel() {
      public void paintComponent(Graphics g) {
        draw(g);
      }
      public Dimension getPreferredSize() {
        return new Dimension(400, 300);
      }
    });
    frame.repaint();
    frame.pack();
  }
  
  private static void draw(Graphics g) {
    for (int i = 0; i < 100; i++) {
      int diameter = (int) (Math.random() * 40) + 20;
      int x = (int) (Math.random() * (WIDTH - diameter * 2)) + diameter;
      int y = (int) (Math.random() * (HEIGHT - diameter * 2)) + diameter;
      Color color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        
      g.setColor(color);
      g.fillOval(x, y, diameter, diameter);
    }
  }
}