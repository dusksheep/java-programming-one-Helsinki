import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a string");
        String stringInput = reader.nextLine();

        System.out.println("Give an integer");
        int integerInput = Integer.valueOf(reader.nextLine());

        System.out.println("Give a double");
        double doubleInput = Double.parseDouble(reader.nextLine());

        System.out.println("Give a boolean");
        String booleanInput = reader.nextLine();

        System.out.println(stringInput);
        System.out.println(integerInput);
        System.out.println(doubleInput);
        System.out.println(booleanInput);
    }
}
