package SwingLearning.Images;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        DrawImages drawImages = new DrawImages("Draw", 500, 500);
        drawImages.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawImages.setResizable(false);
        drawImages.setLocationRelativeTo(null);
        drawImages.setVisible(true);
    }
}
