package Tasks.Decorator_Pattern;

public class AntiDecorator extends Beverage {
    final Beverage beverage;

    public AntiDecorator(Beverage beverage) {
        this.beverage = removeLast(beverage);
    }

    private Beverage removeLast(Beverage beverage) {
        if (beverage instanceof CondimentDecorator) {
            return ((CondimentDecorator) beverage).beverage;
        }
        return beverage;
    }

    public Beverage removeAll(Beverage beverage) {
        while (beverage instanceof CondimentDecorator) {
            beverage = ((CondimentDecorator) beverage).beverage;
        }
        return beverage;
    }

    @Override
    public double cost() {
        return beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription();
    }
}
