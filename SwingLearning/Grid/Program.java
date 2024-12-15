package SwingLearning.Grid;

import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setMinimumSize(new Dimension(300, 300));
        JPanel panel = new JPanel();
        JButton[] buttons = new JButton[3];
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);
        panel.add(Box.createVerticalGlue());

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("btn" + (i + 1));
            buttons[i].setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(buttons[i]);
            panel.add(Box.createVerticalGlue());
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}
