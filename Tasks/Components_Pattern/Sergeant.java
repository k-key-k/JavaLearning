package Tasks.Components_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Sergeant implements Soldier {
    private String name;
    private List<Soldier> subordinates = new ArrayList<Soldier>();
    public Sergeant(String name) {
        this.name = name;
    }

    public void addSubordinate(Soldier soldier) {
        subordinates.add(soldier);
    }

    public void removeSubordinate(Soldier soldier) {
        subordinates.remove(soldier);
    }
    @Override
    public void performDuty() {
        System.out.println("Sergeant " + name + " performing his duties.");
        for (Soldier soldier : subordinates) {
            soldier.performDuty();
        }
    }
}
