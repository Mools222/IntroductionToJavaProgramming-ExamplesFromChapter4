public class Page135_2_ObtainingSubstrings {
    public static void main(String[] args) {

        String message = "Welcome to Java";
        message = message.substring(0, 11) + "HTML";

        System.out.println(message);

        // Test

        message = "Welcome to Java"; // Reset the message to the original value
        message = "HTML" + message.substring(7, 15);
        System.out.println(message);

        message = "Welcome to Java"; // Reset the message to the original value
        message = message.substring(8) + "HTML";
        System.out.println(message);


    }
}
