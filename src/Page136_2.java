public class Page136_2 {
    public static void main(String[] args) {

        String s = "John Johnson";

        int k = s.indexOf(' ');
        String firstName = s.substring(0, k);
        String lastName = s.substring(k + 1);

        System.out.println(firstName);
        System.out.println(lastName);

    }
}
