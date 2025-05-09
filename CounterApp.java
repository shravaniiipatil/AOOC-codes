import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CounterApp extends JFrame implements ActionListener {
JLabel l;
JTextField t;
JButton b1,b2,b3;
int count = 0;
public CounterApp() {
setTitle("Counter");
l= new JLabel("Counter");
t= new JTextField(10);
b1= new JButton("Count Up");
b2= new JButton("Count Down");
b3= new JButton("Reset");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
setLayout(new FlowLayout());
add(l);
add(t);
add(b1);
add(b2);
add(b3);
setSize(500, 100);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == b1) {
count++;
} else if (e.getSource() == b2) {
count--;
} else if (e.getSource() == b3) {
count = 0;
}
t.setText(String.valueOf(count));
}
public static void main(String[] args) {
new CounterApp();
}
}
