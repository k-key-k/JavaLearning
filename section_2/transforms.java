package section_2;

public class transforms {
    public static void main (String[] args) {
        int a = 4;
        // byte b = a; // Error
        byte b = (byte) a;
        System.out.println(b);

        byte x = 7;
        int y = x; // byte -> int

        // byte -> short -> int -> long
        // int -> double
        // short -> float -> double
        // char -> int

        int a_1 = 2147483647;
        float b_1 = a_1;
        System.out.println(b_1);

        int a_2 = 258;
        byte b_2 = (byte) a_2;
        System.out.println(b_2); // 2

        double a_round = 56.9898;
        int b_not_round = (int) a_round; // 56
        int b_round = (int)Math.round(a_round); // 57

        int a_3 = 3;
        double b_3 = 4.6;
        double c_3 = a_3+b_3;

        byte a_4 = 3;
        short b_4 = 4;
        byte c_4 = (byte)(a_4+b_4);

        int d = 'a' + 5; // 97 + 5
        System.out.println(d); // 102
    }
}
