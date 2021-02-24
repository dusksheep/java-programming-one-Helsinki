import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("give a password");
        String inputPassword = reader.nextLine();
        if(inputPassword.equals("hoho")) {
            System.out.println("good");
        } else {
            System.out.println("wrong password");
        }
    }
}
