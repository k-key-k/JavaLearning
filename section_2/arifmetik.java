package section_2;

public class arifmetik {
    public static void main (String[] args){
        int a = 10;
        int b = 7;
        int c = a + b; // 17
        int d = 4 + b; // 11

        c = a - b; // 3
        d = 4 - a; // -6

        c = a * b; // 70
        d = 5 * b; // 35

        a = 20;
        b = 5;
        c = a / b; // 4
        double db = 22.5 / 4.5; // 5.0

        double k = 10 / 4;
        System.out.println(k);
        k = 10.0 / 4.0;
        System.out.println(k);

        int x = 33;
        int y = 5;
        int z = x % y; // 3
        int v = 22 % 4; // 2

        int a_prefix = 8;
        int b_prefix = ++a_prefix;
        System.out.println(a_prefix);
        System.out.println(b_prefix);

        int a_postfix = 8;
        int b_postfix = a_postfix++;
        System.out.println(a_postfix);
        System.out.println(b_postfix);

        double dd = 2.0 - 1.1;
        System.out.println(dd);
    }
}
