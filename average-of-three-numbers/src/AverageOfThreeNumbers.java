import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("first number");
        int firstNumber = Integer.valueOf(reader.nextLine());
        System.out.println("second number");
        int secondNumber = Integer.valueOf(reader.nextLine());
        System.out.println("third number");
        int thirdNumber = Integer.valueOf(reader.nextLine());

        double avg = (1.0 * firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println(avg);


    }
}
