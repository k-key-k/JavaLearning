package WeatherApp.Swing_Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverSim extends JFrame {
    private final JPanel btn_panel;
    private final JButton start, stop;
    private final int width, height;

    public SwingObserverSim(String Title, int w, int h) {
        super(Title);
        width = w;
        height = h;

        setSize(width, height);
        btn_panel = new JPanel();
        start = new JButton("Start");
        stop = new JButton("Stop");

        ActionListener btn_listener = new ButtonListener();
        start.setActionCommand("Запуск");
        stop.setActionCommand("Остановка");

        start.addActionListener(btn_listener);
        stop.addActionListener(btn_listener);

        btn_panel.add(start);
        btn_panel.add(stop);
        getContentPane().add(BorderLayout.NORTH, btn_panel);
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("Остановка")) {
                start.setText("Start");
                stop.setText("Stop");
            } else {
                start.setText("Started");
                stop.setText("Stop");
            }
        }
    }
}

