import java.applet.*;
import java.awt.*;

public class Slip_2B extends Applet implements Runnable {
    int wave = 0;

    public void init() {
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            wave = (wave + 10) % 20;
            repaint();
            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(50, 50 + wave, 100, 20);
        g.setColor(Color.WHITE);
        g.fillRect(50, 70 + wave, 100, 20);
        g.setColor(Color.GREEN);
        g.fillRect(50, 90 + wave, 100, 20);
        g.setColor(Color.BLACK);
        g.fillRect(45, 50, 5, 100);
    }
}
