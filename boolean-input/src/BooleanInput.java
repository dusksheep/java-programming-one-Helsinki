import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write true");
        String input = reader.nextLine();
        if(input.equals("true")) {
            System.out.println("true");
        } else {
            System.out.println("not true");
        }
    }
}
