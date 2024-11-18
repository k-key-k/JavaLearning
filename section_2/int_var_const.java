package section_2;

public class int_var_const {
    public static void main (String[] args) {
        int x;
        x = 10;
        System.out.println(x);

        int x_2 = 10;
        System.out.println(x_2);

//        int x_3;
//        System.out.println(x_3); Error

        int x_4, y;
        x_4 = 10;
        y = 25;
        System.out.println(x_4);
        System.out.println(y);

        int x_5 = 8, y_2 = 15;
        System.out.println(x_5);
        System.out.println(y_2);

        var x_6 = 10;
        System.out.println(x_6);

//        var x_6; Error
//        x_6 = 10;

        final int LIMIT = 5;
        System.out.println(LIMIT);
        // LIMIT = 57; Error
    }
}
