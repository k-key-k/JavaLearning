package SwingLearning.Counter;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private final JLabel label;
    private final JButton incrementButton;
    private final JButton resetButton;

    public View() {
        setTitle("Счётчик");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(200, 150);
        setLayout(new FlowLayout());

        label = new JLabel("Счёт: 0");
        incrementButton = new JButton("Увеличить");
        resetButton = new JButton("Сбросить");

        add(label);
        add(incrementButton);
        add(resetButton);
    }

    public void setCountText(int count) {
        label.setText("Счёт: " + count);
    }

    public JButton getIncrementButton() {
        return incrementButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }
}
