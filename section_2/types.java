package section_2;

public class types {
    public static void main (String[] args) {

        // boolean: хранит значение true или false
        boolean isActive = false;
        boolean isAlive = true;

        // byte: хранит целое число от -128 до 127 и занимает 1 байт
        byte a = 3;
        byte b = 8;

        // short: хранит целое число от -32768 до 32767 и занимает 2 байта
        short a_2 = 3;
        short b_2 = 8;

        // int: хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        int a_3 = 3;
        int b_3 = 8;

        // long: хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
        long a_4 = 5;
        long b_4 = 10;

        // double: хранит число с плавающей точкой от ±4.9*10^-324 до ±1.7976931348623157*10^308 и занимает 8 байт
        double a_5 = 2.7;
        double b_5 = 9.9;

        // float: хранит число с плавающей точкой от -3.4*10^38 до 3.4*10^38 и занимает 4 байта
        float a_6 = 2.7F;
        float b_6 = 9.9F;

        // char: хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535
        char symbol = 'a';

        byte x = 1;
        short y = 2;
        long c = 2121;

        // long num = 2147483649; Error
        long num = 2147483649L;

        int num111 = 0x6F; // 16-теричная система, число 111
        int num8 = 010; // 8-ричная система, число 8
        int num13 = 0b1101; // 2-ичная система, число 13

        int first = 123_456;
        int second = 123_456_789;
        System.out.println(first);
        System.out.println(second);

        float f1 = 30.6f;
        double db = 30.6;

        char ch = 102; // ch = 'f'
        System.out.println(ch);
        char ch_16 = '\u0066';
        System.out.println(ch_16);

        String text = "Hello \nworld";
        System.out.println(text);

        String text_2 = "Lorem ipsum Lorem ipsum\n" +
                "Lorem ipsumLorem ipsumLorem ipsum\n"+
                "Lorem ipsumLorem ipsumLorem ipsum";
        System.out.println(text_2);

        String text_3 = """
                Lorem ipsumLorem ipsumLorem ipsum1
                Lorem ipsumLorem ipsumLorem ipsum2
                Lorem ipsumLorem ipsumLorem ipsum3
                """;
        System.out.println(text_3);
    }
}
