package Tasks.Components_Pattern;

public class Private implements Soldier {
    private String name;
    public Private(String name) {
        this.name = name;
    }
    @Override
    public void performDuty() {
        System.out.println("Private " + name + " perfroming his duty.");
    }
}
