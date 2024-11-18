package section_2;

public class rank_operations {
    public static void main(String[] args) {
        byte b = 7; // 0000 0111
        short s = 7; // 0000 0000 0000 0111

        int a1 = 2; // 010
        int b1 = 5; // 101
        System.out.println(a1&b1); // res = 0

        int a2 = 4; // 100
        int b2 = 5; // 101
        System.out.println(a2&b2); // res = 100 = 4

        System.out.println(a1 | b1); // res = 111 = 7
        System.out.println(a2 | b2); // res = 101 = 5

        int number = 45; // 101101
        int key = 102; // 1100110
        int encrypt = number ^ key; // 1001011 = 75
        System.out.println("Encrypt num: " + encrypt);

        int decrypt = encrypt ^ key; // 101101 = 45
        System.out.println("Decrypt num: " + decrypt);

        byte a = 12; // 0000 1100
        System.out.println(~a); // 1111 0011 = -13

        // 4<<1   100 -> 1000 => 8
        // 16>>1  10000 -> 1000 => 8
        // -8>>>2 1000 -> 1073741822
    }
}
