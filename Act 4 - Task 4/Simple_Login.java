import java.util.Scanner;

public class Simple_Login {
    public static void main(String[] args) {

        //Scanner
         Scanner In = new Scanner(System.in);
        
        // Set Username And Password
        String username = "OhnePixel";
        String password = "GoldGoldGold";

        // Variables for Input
        String inputUsername;
        String inputPassword;

        // TIP :)
        System.out.println("TIP: Username: OhnePixel Password: GoldGoldGold");

        // Space
        System.out.println(" ");
        System.out.println(" ");

        // Login Prompt
        System.out.println("Enter Username: ");
        inputUsername = In.nextLine();
        System.out.println("Enter Password: ");
        inputPassword = In.nextLine();

        In.close();

        // Space
        System.out.println(" ");
        System.out.println(" ");

        // Validate Login
        if(inputUsername == username && inputPassword == password) {
            System.out.println("Login Successful !!");
        } else {
            System.out.println("Login Failed !!");
        }
        

    }
}
