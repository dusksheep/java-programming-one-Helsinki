import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.valueOf(reader.nextLine());
        System.out.println(number);
    }
}
