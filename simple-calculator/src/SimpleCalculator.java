import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("first number");
        String firstInput = reader.nextLine();
        System.out.println("second number");
        String secondInput = reader.nextLine();
        int firstNumber = Integer.valueOf(firstInput);
        int secondNumber = Integer.valueOf(secondInput);
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = 1.0 * firstNumber / secondNumber;
        System.out.println(firstInput + " + " + secondInput + " = " + sum);
        System.out.println(firstInput + " - " + secondInput + " = " + difference);
        System.out.println(firstInput + " * " + secondInput + " = " + product);
        System.out.println(firstInput + " / " + secondInput + " = " + quotient);




    }
}
