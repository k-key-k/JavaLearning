import org.example.Calculator;

public class Main {
    public static void main(String[] agrs) {
        Calculator calculator = new Calculator();
        double res = calculator.add(10, 20);
        System.out.println("res add: " + res);

        double angle = Math.PI / 2;
        double sinRes = calculator.sin(angle);
        System.out.println("Res for sin(90'): " + sinRes);
    }
}
