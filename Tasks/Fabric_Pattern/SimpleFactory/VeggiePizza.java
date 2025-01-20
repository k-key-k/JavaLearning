package Tasks.Fabric_Pattern.SimpleFactory;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Whole Wheat Crust";
        sauce = "Tomato Basil Sauce";
        toppings.add("Shredded Mozzarella");
        toppings.add("Grated Parmesan");
        toppings.add("Diced Bell Peppers");
        toppings.add("Sliced Olives");
        toppings.add("Sliced Mushrooms");
    }
}
