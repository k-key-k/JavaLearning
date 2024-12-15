package SwingLearning.Images;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class DrawImages extends JFrame {
    private BufferedImage my_pic;
    private int color = 0;

    public DrawImages(String title, int w, int h) {
        super(title);
        setSize(w, h);
        JPanel panel = new JPanel();
        try {
            String img_path = "src/img/javap.jpg";
            my_pic = ImageIO.read(new File(img_path));
            JPanel figure_panel = new JPanel();
            JLabel pic_label = new JLabel(new ImageIcon(my_pic));
            figure_panel.add(pic_label);
            getContentPane().add(BorderLayout.CENTER, figure_panel);
        } catch (Exception e) {
            System.out.println("Problem:" + e);
        }

        JButton btn = new JButton("RAMA");
        ActionListener listener = new ButtonListener();
        btn.setActionCommand("SHOW");
        btn.addActionListener(listener);

        panel.add(btn);
        getContentPane().add(BorderLayout.NORTH, panel);
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("SHOW")) {
                Graphics2D g = (Graphics2D) my_pic.getGraphics();
                g.setStroke(new BasicStroke(5));
                g.setColor(new Color(255 - color, color, 255));
                color += 50;
                if (color > 250) color = 0;
                g.drawOval(10, 10,
                        my_pic.getWidth() - 20,
                        my_pic.getHeight() - 20);
                repaint();
            }
        }
    }
}
