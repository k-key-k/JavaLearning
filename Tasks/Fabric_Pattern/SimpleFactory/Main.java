package Tasks.Fabric_Pattern.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Order: " + pizza.getName() + "\n");

        pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println("Order: " + pizza.getName() + "\n");

        pizza = pizzaStore.orderPizza("veggie");
        System.out.println("Order: " + pizza.getName() + "\n");
    }
}
