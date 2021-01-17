import java.util.Scanner;

public class DoubleInput {
    public static void mains(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a double");
        double input = Double.parseDouble(reader.nextLine());
        System.out.println(input);

    }
}
