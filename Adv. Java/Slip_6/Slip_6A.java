import java.awt.*;
import javax.swing.*;

public class Slip_6A extends JFrame {
    private boolean isVisible = true; // Flag to toggle image visibility
    private ImageIcon image; // Image to be displayed

    public Slip_6A() {
        setTitle("Blinking Image");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        image = new ImageIcon("image.jpg"); // Change this to your image path

        // Timer to toggle image visibility every 500ms
        new Timer(500, e -> {
            isVisible = !isVisible;
            repaint();
        }).start();

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (isVisible) {
            g.drawImage(image.getImage(), 100, 100, this);
        }
    }

    public static void main(String[] args) {
        new Slip_6A();
    }
}
