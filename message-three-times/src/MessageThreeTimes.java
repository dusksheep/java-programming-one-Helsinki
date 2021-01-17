import java.util.Scanner;

public class MessageThreeTimes {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Wire a message: ");
        String input = reader.nextLine();
        System.out.println(input);
        System.out.println(input);
        System.out.println(input);
    }
}
