import java.awt.*;
import javax.swing.*;

public class Slip_1A extends JFrame {
    private JLabel label;
    private int x = 10, direction = 2;
    
    public Slip_1A() {
        label = new JLabel("Scrolling Text");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        setLayout(null);
        label.setBounds(x, 50, 150, 30);
        add(label);
        
        new Timer(30, e -> {
            x += direction;
            if (x > getWidth() - 150 || x < 0) direction *= -1;
            label.setBounds(x, 50, 150, 30);
        }).start();
        
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Slip_1A();
    }
}
