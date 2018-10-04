public class Page148_FormatDemo {
    public static void main(String[] args) {

        // Display the header of the table
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent"); // Disse ord er mellem 4 og 7 tegn, så der kommer 6-3 mellemrum efter dem

        // Display values for 30 degrees
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians)); // 1 decimal point + 4 decimaler + kun 1 tal før decimal point = 1 + 4 + 1 = alle tal er på 6 karakterer. Dvs. der kommer 4 mellemrum efter dem
                                                                                                                                             // Bortset fra "degrees" som bare er 2 karakterer uden kommatal = 8 mellemrum efter
        // Display values for 60 degrees
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

        //The statement in lines 4–5 displays the column names of the table. The column names are
        //strings. Each string is displayed using the specifier %-10s, which left-justifies the string. The
        //statement in lines 10–12 displays the degrees as an integer and four float values. The integer is
        //displayed using the specifier %-10d and each float is displayed using the specifier %-10.4f,
        //which specifies four digits after the decimal point.
    }
}