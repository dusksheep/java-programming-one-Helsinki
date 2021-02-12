import java.util.Scanner;

public class speedTicket {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("give an integer");
        int input = Integer.valueOf(reader.nextLine());
        if(input > 120) {
            System.out.println("Speeding ticket!");
        }


    }
}
