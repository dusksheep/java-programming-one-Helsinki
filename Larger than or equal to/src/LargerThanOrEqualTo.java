import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give first integer");
        int input = Integer.valueOf(reader.nextLine());
        System.out.println("Give second integer");
        int input2 = Integer.valueOf(reader.nextLine());
        if(input == input2) {
            System.out.println("The numbers are equal!");
        }
        else if(input < input2) {
            System.out.println("Greater number is " + input2);
        } else {
            System.out.println("Greater number is " + input);
        }
    }
}
