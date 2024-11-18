package section_2;

public class conditional_operations {
    public static void main (String[] args) {
        int a = 10;
        int b = 4;
        boolean c = a == b; // 10 == 4 false
        boolean d = a == 10; // 10 == 10 true

        c = a != b; // 10 != 4 true
        d = a != b; // 10 != 10 false

        c = a > b; // 10 > 4 true

        boolean c_1 = a >= 10; // 10 >= 10 true
        boolean c_2 = a >= 4; // 10 >= 4 true
        boolean c_3 = a >= 20; // 10 >= 20 false

        c_1 = a <= 10; // 10 <= 10 true
        c_2 = a <= 4; // 10 <= 4 false
        c_3 = a <= 20; // 10 <= 20 true

        boolean a1 = (5 > 6) || (4 < 6);
        boolean a2 = (5 > 6) || (4 > 6);
        boolean a3 = (5 > 6) && (4 < 6);
        boolean a4 = (50 > 6) && (4 / 2 < 3);
        boolean a5 = (5 < 6) ^ (4 > 6);
        boolean a6 = (50 > 6) ^ (4 / 2 < 3);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);


    }
}
