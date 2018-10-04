public class Page137_1_ConversionBetweenStringsNumbers {
    public static void main(String[] args) {

        String intString = "123";
        int intValue = Integer.parseInt(intString);
        System.out.println(intValue);

        String doubleString = "123.45";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println(doubleValue);

        // Next

        String s = 123 + "";
        System.out.println(s);

        String s2 = 123.000 + "";
        System.out.println(s2);

    }
}
