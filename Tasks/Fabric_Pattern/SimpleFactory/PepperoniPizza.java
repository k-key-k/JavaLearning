package Tasks.Fabric_Pattern.SimpleFactory;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Thin Crust";
        sauce = "Spicy Tomato Sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Shredded Mozzarella Cheese");
    }
}
