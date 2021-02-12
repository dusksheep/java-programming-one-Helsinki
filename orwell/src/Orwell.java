import java.util.Scanner;

public class Orwell {

        public static void main (String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.println("give an integer");
            int input = Integer.valueOf(reader.nextLine());
            if(input == 1984) {
                System.out.println("Orwell");
            }


        }
    }

}
