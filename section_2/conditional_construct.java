package section_2;

public class conditional_construct {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("num1 > num2");
        } else {
            System.out.println("num1 < num2");
        }

        num1 = 6;
        num2 = 8;
        if (num1 > num2) {
            System.out.println("num1 > num2");
        } else if (num1 < num2) {
            System.out.println("num1 < num2");
        } else {
            System.out.println("num1 == num2");
        }

        num1 = 8;
        num2 = 6;
        if (num1 > num2 && num1 > 7) {
            System.out.println("num1 > num2 and num1 > 7");
        }

        int num = 8;
        switch (num) {

            case 1:
                System.out.println("num = 1");
                break;
            case 8:
                System.out.println("num = 8");
                num++;
                break;
            case 9:
                System.out.println("num = 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }

        int x = 3;
        int y = 2;
        int z = x < y ? (x + y) : (x - y);
        System.out.println(z);

    }
}
