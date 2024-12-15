package SwingLearning.Temperature;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JTextField celsField;
    private JButton convertBtn;
    private JLabel fahrLabel;

    public View() {
        setTitle("Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 300);
        setLayout(new FlowLayout());

        celsField = new JTextField(10);
        convertBtn = new JButton("Convert");
        fahrLabel = new JLabel("Fahrenheit: ");

        add(new JLabel("Celsius: "));
        add(celsField);
        add(convertBtn);
        add(fahrLabel);
    }

    public String getCelsInput() {
        return celsField.getText();
    }

    public void setFahrOutput(String fahr) {
        fahrLabel.setText("Fahrenheit: " + fahr);
    }

    public JButton getConvertBtn() {
        return convertBtn;
    }
}
