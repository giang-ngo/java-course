package inheritance.lesson5;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private int width;
    private int height;

    public MyFrame(int width, int height, String title) {
        this.width = width;
        this.height = height;
        setTitle(title);
        this.setSize(width, height);
//        this.setLocation(100,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.BLUE);
        this.pack();
    }

    @Override
    public void paint(Graphics g) {
        int radius = 150;
        var g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2));
//        g.fillOval(width / 2 - radius,
//                height / 2 - radius, 2 * radius, 2 * radius);
//        g.drawLine(28, 28, 200, 200);
        drawRoundRect(g);
        drawCircle(g);


    }

    private void drawCircle(Graphics g) {
        int radius = 150;
        g.setColor(Color.DARK_GRAY);
        g.fillOval(this.width / 2 - radius,
                this.height / 2 - radius, 2 * radius, 2 * radius);
    }

    private void drawRoundRect(Graphics g) {
        int width = 250;
        int height = 250;
        g.setColor(Color.red);
        g.fillRoundRect(this.width / 2 - width / 2,
                this.height / 2 - height / 2, width,
                height, 15, 15);
    }

    public static void main(String[] args) {
        String title = "My First JFrame Application";
        int width = 400;
        int height = 400;
        MyFrame frame = new MyFrame(width, height, title);
        frame.setVisible(true);
    }
}
