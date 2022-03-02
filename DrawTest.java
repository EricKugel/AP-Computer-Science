import javax.swing.*;
import java.awt.*;

public class DrawTest {
  public static void main (String[] arg0) {
    JFrame frame = new JFrame();
    frame.setTitle("Draw Test");
    frame.add(new JPanel() {
      public void paintComponent(Graphics g)
      {
        drawPicture(g);
      }
      public Dimension getPreferredSize()
      {
        return new Dimension(640,480);
      }
    });
    frame.setVisible(true);
    frame.pack();
  }
  
  public static void drawPicture(Graphics g) {
    g.setColor(Color.BLUE);
    g.fillRect(100, 100, 100, 100);
    g.setColor(Color.RED);
    g.fillRect(200, 200, 100, 100);
    g.setColor(Color.YELLOW);
    g.fillRect(300, 300, 100, 100);
  }
}