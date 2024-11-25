package Tasks.Zoopark_ver_duck_type;

import java.lang.reflect.Method;

public class Main {
    public static void feedAnimal(Object animal, String food) {

        try {

            Method eatMethod = animal.getClass().getMethod("eat", String.class);
            eatMethod.invoke(animal, food);
        } catch (NoSuchMethodException e) {
            System.out.println(animal.getClass().getSimpleName() + " cannot eat");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Object[] animals = {new Lion(), new Zebra(), new Elephant(), new Robot(), "Not an animal"};

        for (Object animal : animals) {
            feedAnimal(animal, "grass");
        }
    }
}
