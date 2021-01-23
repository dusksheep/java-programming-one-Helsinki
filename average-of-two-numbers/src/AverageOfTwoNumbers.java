import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("number 1");
        int firstNumber = Integer.valueOf(reader.nextLine());
        System.out.println("number 2");
        int secondNumber = Integer.valueOf(reader.nextLine());
        double avg = (1.0 * firstNumber + secondNumber) / 2;
        System.out.println(avg);



    }
}
