import java.util.Scanner;

public class LearYear {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("give a year");
        int inputedYear = Integer.valueOf(reader.nextLine());

        if (inputedYear % 100 == 0) {
            if (inputedYear % 4 == 0 && inputedYear % 400 == 0) {
                System.out.println("leap year");
            } else {
                System.out.println("not a leap year");
            }
        }
        else if (inputedYear % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}

