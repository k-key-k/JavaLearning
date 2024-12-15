package SwingLearning.TicTacToe;

import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {
    private final JButton[][] buttons;

    private final int size = 3;

    private final int[][] cells = new int[size][size];

    public TicTacToe(String title, int w, int h) {
        super(title);
        setSize(w, h);

        JPanel btnPanels = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        if (cells[row][col] == 1) {
                            buttons[row][col].setText("X");
                        } else if (cells[row][col] == 2) {
                            buttons[row][col].setText("0");
                        } else {
                            buttons[row][col].setText("");
                        }
                    }
                }
            }
        };
        buttons = new JButton[size][size];
        Font font = new Font("Arial", Font.BOLD, 80);

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                buttons[row][col] = new JButton();
                buttons[row][col].putClientProperty("row", row);
                buttons[row][col].putClientProperty("col", col);
                buttons[row][col].setFont(font);
                buttons[row][col].setForeground(Color.MAGENTA);

                buttons[row][col].addActionListener(e -> {
                    JButton srcBtn = (JButton) e.getSource();
                    int row1 = (int) srcBtn.getClientProperty("row");
                    int col1 = (int) srcBtn.getClientProperty("col");
                    gameTurns(row1, col1);
                    repaint();
                });

                btnPanels.add(buttons[row][col]);
            }
        }

        btnPanels.setLayout(new GridLayout(size, size));
        getContentPane().add(BorderLayout.CENTER, btnPanels);
    }

    boolean checkWin(int winValue) {
        for (int i = 0; i < size; i++)
            if ((cells[i][0] == winValue && cells[i][1] == winValue && cells[i][2] == winValue) ||
                    (cells[0][i] == winValue && cells[1][i] == winValue && cells[2][i] == winValue))
                return true;
        return (cells[0][0] == winValue && cells[1][1] == winValue && cells[2][2] == winValue) ||
                (cells[2][0] == winValue && cells[1][1] == winValue && cells[0][2] == winValue);
    }

    boolean isCellValid(int row, int col) {
        return (cells[row][col] == 0);
    }

    boolean isTableFull() {
        for (int row = 0; row < size; row++)
            for (int col = 0; col < size; col++)
                if (cells[row][col] == 0)
                    return false;
        return true;
    }

    void restartGame() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                cells[row][col] = 0;
            }
        }
        repaint();
    }

    void turnAi() {
        if(isCellValid(1, 1)) {
            cells[1][1] = 2;
        } else {
            int row, col;
            do {
                row = ((int) (Math.random() * size));
                col = ((int) (Math.random() * size));
            } while (!isCellValid(row, col));
            cells[row][col] = 2;
        }
    }

    void gameTurns(int row, int col) {
        if (cells[row][col] < 1) {
            cells[row][col] = 1;
            if (checkWin(1)) {
                repaint();
                JOptionPane.showMessageDialog(TicTacToe.super.getContentPane(), "Вы выиграли");
                restartGame();
            }

            if (isTableFull()) {
                repaint();
                JOptionPane.showMessageDialog(TicTacToe.super.getContentPane(), "Ничья");
                restartGame();
            }
            turnAi();

            if (checkWin(2)) {
                repaint();
                JOptionPane.showMessageDialog(TicTacToe.super.getContentPane(), "Компьютер выиграл");
                restartGame();
            }
            if (isTableFull()) {
                repaint();
                JOptionPane.showMessageDialog(TicTacToe.super.getContentPane(), "Ничья");
                restartGame();
            }
        }
    }
}
