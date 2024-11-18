package section_2;

import java.util.Scanner;

public class input_output {
    public static void main (String[] args) {
        System.out.println("1Hello world!");
        System.out.println("Bye World...");

        System.out.print("2Hello world!");
        System.out.print("Bye World...");

        System.out.print("\n3Hello world!\n");
        System.out.print("Bye World...\n");

        int x = 5;
        int y = 6;
        System.out.println("x=" + x + "; y=" + y);
        System.out.printf("x=%d; y=%d \n", x, y);

        String name = "Bob";
        int age = 27;
        float height = 1.7f;
        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
//        in.close();

        Scanner in_2 = new Scanner(System.in);
        System.out.print("Input name: ");
        String in_name = in_2.nextLine();
        System.out.print("Input Age: ");
        int in_age = in_2.nextInt();
        System.out.print("Input height: ");
        float in_height = in_2.nextFloat();
        System.out.printf("Name: %s Age: %d Height: %.2f \n", in_name, in_age, in_height);
        in_2.close();

    }
}
