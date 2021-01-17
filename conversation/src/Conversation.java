import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        String input = reader.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String input2 = reader.nextLine();
        System.out.println("Thanks for sharing!");
    }
}
