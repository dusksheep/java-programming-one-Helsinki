import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("write the number of days:");
        String input = reader.nextLine();
        int numberOfDays = Integer.valueOf(input);
        int numberOfSeconds = numberOfDays * 24 * 60 * 60;
        System.out.println("the number of seconds in " + numberOfDays + " is: " + numberOfSeconds);
    }
}