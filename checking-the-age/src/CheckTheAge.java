import java.util.Scanner;

public class CheckTheAge {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("give your age");
        int inputAge = Integer.valueOf(reader.nextLine());
        if(inputAge < 0 || inputAge > 120) {
            System.out.println("your age is strange");
        } else {
            System.out.println("ty");
        }

    }
}
