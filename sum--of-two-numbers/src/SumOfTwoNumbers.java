import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(">");
        int firstNumber = Integer.valueOf(reader.nextLine());
        int secondNumber = Integer.valueOf(reader.nextLine());
        System.out.println("sum " + firstNumber + secondNumber);
    }
}
