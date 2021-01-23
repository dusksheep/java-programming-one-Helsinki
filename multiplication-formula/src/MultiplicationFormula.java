import java.util.Scanner;

public class MultiplicationFormula {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("first number");
        String firstInput = reader.nextLine();
        System.out.println("second number");
        String secondInput = reader.nextLine();
        int firstNumber = Integer.valueOf(firstInput);
        int secondNumber = Integer.valueOf(secondInput);
        System.out.println(firstInput + " * " + secondInput + " = " + (firstNumber * secondNumber));
    }
}
