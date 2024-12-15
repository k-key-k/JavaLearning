package WeatherApp.Swing_Observer;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        SwingObserverSim simulator = new SwingObserverSim("Title", 300, 300);

        simulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simulator.setResizable(false);
        simulator.setLocationRelativeTo(null);
        simulator.setVisible(true);
    }
}
