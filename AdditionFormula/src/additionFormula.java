import java.util.Scanner;

public class additionFormula {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("first number");
        String firstNumber = reader.nextLine();
        System.out.println("second number");
        String secondNumber = reader.nextLine();

        int first = Integer.valueOf(firstNumber);
        int second = Integer.valueOf(secondNumber);
        System.out.println(firstNumber + " + " + secondNumber + " = " + (first + second));
    }
}
