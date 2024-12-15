package SwingLearning.TicTacToe;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe("Game", 500, 500);

        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setLocationRelativeTo(null);
        game.setResizable(false);
        game.setVisible(true);
    }
}
