import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator extends JFrame implements ActionListener {
    JTextField textField;
    String operator = "";
    double num1 = 0;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);
        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] btnLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };
        for (String text : btnLabels) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("C")) {
            textField.setText("");
            num1 = 0;
            operator = "";
        } else if (command.equals("=")) {
            if (!operator.isEmpty() && !textField.getText().isEmpty()) {
                double num2 = Double.parseDouble(textField.getText());
                double result = switch (operator) {
                    case "+" -> num1 + num2;
                    case "-" -> num1 - num2;
                    case "*" -> num1 * num2;
                    case "/" -> num2 != 0 ? num1 / num2 : 0;
                    default -> 0;
                };
                textField.setText(String.valueOf(result));
                operator = "";
            }
        } else { // +, -, *, /
            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            }
        }
    }
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
