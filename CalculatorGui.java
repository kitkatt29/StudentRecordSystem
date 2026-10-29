
import javax.swing.*;
import java.awt.*;

public class CalculatorGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        frame.setLayout(new FlowLayout());

        JLabel lblNum1 = new JLabel("First Number:");
        JTextField txtNum1 = new JTextField(10);

        JLabel lblNum2 = new JLabel("Second Number:");
        JTextField txtNum2 = new JTextField(10);

        JButton btnAdd = new JButton("Add (+)");

        JLabel lblResult = new JLabel("Result: ");

        btnAdd.addActionListener(e -> {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());

            double sum = num1 + num2;

            lblResult.setText("Result: " + sum);
        });

        frame.add(lblNum1);
        frame.add(txtNum1);
        frame.add(lblNum2);
        frame.add(txtNum2);
        frame.add(btnAdd);
        frame.add(lblResult);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
