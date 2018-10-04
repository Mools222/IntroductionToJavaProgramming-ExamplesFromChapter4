public class TestDeciHexOctalBinary {
    public static void main(String[] args) {

        // Table of 8-bit ASCII Character Codes
        // https://www.sciencebuddies.org/science-fair-projects/references/table-of-8-bit-ascii-character-codes

        // Alle disse char values giver et stort A

        // Decimal
        // By default, an integer literal is a decimal integer number - Der skal derfor ikke noget foran tallet (fx 0X, 0 eller 0B) som ved de andre
        char a = 65;
        System.out.println(a);

        // Hex - læg mærke til single quotation marks
        char b = '\u0041';
        System.out.println(b);

        // Hex
        char c = 0X41;
        System.out.println(c);

        // Octal
        char d = 00101;
        System.out.println(d);

        // Binary
        char e = 0B01000001;
        System.out.println(e);

        // Boolean
        boolean boo = a == b && b == c && c == d && d == e;
        System.out.println("Is it all the same? " + boo);


        // Pile of poo - http://www.fileformat.info/info/unicode/char/1F4A9/index.htm
        String poo = "💩";
        String poo2 = "\uD83D\uDCA9";
        System.out.println(poo + poo2);


        char asdf = (char)(8 + '0');
        System.out.println(asdf);
        char asd = '0';
        System.out.println(asd);

        char qwr = (char)(13 - 10 + 'A');
        System.out.println(qwr);

        char qq2 = 1 + 'A';
        System.out.println(qq2);

    }
}
