import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int inputNumber = Integer.valueOf(reader.nextLine());
        if(inputNumber % 2 == 1) {
            System.out.println("the number is odd");
        } else {
            System.out.println("the number is even");
        }
    }
}
