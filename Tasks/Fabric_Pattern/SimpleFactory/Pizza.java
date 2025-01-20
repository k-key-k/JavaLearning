package Tasks.Fabric_Pattern.SimpleFactory;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();


    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    public void bake() {
        System.out.println("Baking " + name + " at 350 degrees for 25 min.");
    }

    public void cut() {
        System.out.println("Cutting " + name + " on 8 slices.");
    }

    public void box() {
        System.out.println("Placing " + name + " in PizzaStore box.");
    }

    public String getName(){
        return name;
    }
}
