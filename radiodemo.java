import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class radiodemo extends JFrame implements ActionListener {
JRadioButton male, female, other;
ButtonGroup group;
JTextField t1;
JButton showButton;
public radiodemo() {
setTitle("Gender Selection");
male = new JRadioButton("Male");
female = new JRadioButton("Female");
other = new JRadioButton("Other");
group = new ButtonGroup();
group.add(male);
group.add(female);
group.add(other);
t1 = new JTextField(20);
t1.setEditable(false);
showButton = new JButton("Show");
showButton.addActionListener(this);
setSize(400, 300);
setLayout(new FlowLayout());
add(male);
add(female);
add(other);
add(showButton);
add(t1);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e) {
if (male.isSelected()) {
t1.setText("You selected: Male");
} else if (female.isSelected()) {
t1.setText("You selected: Female");
} else if (other.isSelected()) {
t1.setText("You selected: Other");
} else {
t1.setText("No selection made.");
}
}
public static void main(String args[]) {
new radiodemo();
}
}
