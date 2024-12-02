package WeatherApp.Swing_Listener_Lambda;

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
        btn.addActionListener(e ->
                System.out.println("don't do it"));
        btn.addActionListener(e ->
                System.out.println("do it!!!"));
    }
}
