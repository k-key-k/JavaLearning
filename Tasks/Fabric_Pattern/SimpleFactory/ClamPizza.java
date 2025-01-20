package Tasks.Fabric_Pattern.SimpleFactory;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin Crust";
        sauce = "White Garlic Sauce";
        toppings.add("Fresh Clams");
        toppings.add("Grated Parmesan Cheese");
    }
}
