import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give an integer");
        int input = Integer.valueOf(reader.nextLine());
        if (input <= 0) {
            System.out.println("The number is not positive");
        } else {
            System.out.println("The number is positive");
        }

    }
}
