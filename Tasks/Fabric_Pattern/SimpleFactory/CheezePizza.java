package Tasks.Fabric_Pattern.SimpleFactory;

public class CheezePizza extends Pizza {
    public CheezePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
