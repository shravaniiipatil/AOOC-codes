import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseCoordinates extends JFrame implements MouseMotionListener {
    JLabel label;

    MouseCoordinates() {
        setTitle("Mouse Coordinates");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Move the mouse...");
        label.setBounds(50, 100, 200, 30);
        add(label);

        addMouseMotionListener(this);
        setVisible(true);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse at X: " + e.getX() + ", Y: " + e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Not used but required by interface
    }

    public static void main(String[] args) {
        new MouseCoordinates();
    }
}
