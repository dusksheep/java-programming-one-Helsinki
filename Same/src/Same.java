import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("first string");
        String firstString = reader.nextLine();
        System.out.println("second string");
        String secondString = reader.nextLine();

        if(firstString.equals(secondString)) {
            System.out.println("the strings are equals");
        } else {
            System.out.println("the strings are not equals");
        }
    }
}
