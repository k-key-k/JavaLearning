package Tasks.Components_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Captain implements Soldier {
    private String name;
    private List<Soldier> subordinates = new ArrayList<>();
    public Captain(String name) {
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
        System.out.println("Captain " + name + " performing his duties.");
        for (Soldier soldier : subordinates) {
            soldier.performDuty();
        }
    }
}
