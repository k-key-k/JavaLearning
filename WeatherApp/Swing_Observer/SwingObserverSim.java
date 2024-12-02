package WeatherApp.Swing_Observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverSim {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverSim sim = new SwingObserverSim();
        sim.go();
    }
    public void go() {
        frame = new JFrame();

        JButton btn = new JButton("should i do it?");
        btn.addActionListener(new AngelListener());
        btn.addActionListener(new DevilListener());

    }

    class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("don't do it");
        }
    }

    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Do it!!!");
        }
    }
}
