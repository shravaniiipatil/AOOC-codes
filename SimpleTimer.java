import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame implements ActionListener {
    JLabel label;
    JButton startButton, stopButton;
    Timer timer;
    int seconds = 0;

    public SimpleTimer() {
        setTitle("Simple Timer");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Time: 0 sec");
        label.setFont(new Font("Arial", Font.BOLD, 20));

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        startButton.addActionListener(this);
        stopButton.addActionListener(this);

        add(label);
        add(startButton);
        add(stopButton);
        timer = new Timer(1000, e -> {
            seconds++;
            label.setText("Time: " + seconds + " sec");
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            timer.start();
        } else if (e.getSource() == stopButton) {
            timer.stop();
        }
    }

    public static void main(String[] args) {
        new SimpleTimer();
    }
}
