import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sumOfThreeNumbers = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(">");
            int input = Integer.valueOf(reader.nextLine());
            sumOfThreeNumbers = sumOfThreeNumbers + input;
        }
        System.out.println(sumOfThreeNumbers);
    }
}
