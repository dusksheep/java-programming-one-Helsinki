import java.util.Scanner;

public class Ancient {


        public static void main (String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Give a year");
            int input = Integer.valueOf(reader.nextLine());
            if(input < 2015) {
                System.out.println("Shit ideology!");
            }


        }
    }


