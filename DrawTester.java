import javax.swing.*;
import java.awt.*;

public class DrawTester {
    public static void main(String[] arg0) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                draw(g);
            }
        };
        panel.setPreferredSize(new Dimension(640, 480));
        frame.add(panel);
        frame.pack();
    }

    private static void draw(Graphics g) {
        // Draw here
        g.drawString("Hello, world!", 300, 200);
    };
}