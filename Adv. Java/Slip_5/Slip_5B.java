import java.applet.*;
import java.awt.*;

public class Slip_5B extends Applet implements Runnable {
    private int signal = 0; // 0 - Red, 1 - Yellow, 2 - Green

    public void init() {
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(1000); // Change signal every 1 second
            } catch (InterruptedException e) {}
            signal = (signal + 1) % 3;
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 100, 250); // Traffic Light Box
        
        g.setColor(signal == 0 ? Color.RED : Color.GRAY);
        g.fillOval(75, 60, 50, 50); // Red Light

        g.setColor(signal == 1 ? Color.YELLOW : Color.GRAY);
        g.fillOval(75, 130, 50, 50); // Yellow Light

        g.setColor(signal == 2 ? Color.GREEN : Color.GRAY);
        g.fillOval(75, 200, 50, 50); // Green Light
    }
}
