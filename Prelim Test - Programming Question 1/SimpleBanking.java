
import java.util.Scanner;



// CRITERIA
// Allow the user to deposit and withdraw money.
// Prevent withdrawals that exceed the account balance.
// Display the current balance after each transaction.


public class SimpleBanking {
    public static void main(String[] args) {

        //Create Scanner Instance
       Scanner In = new Scanner(System.in);

        // Variables
        double balance = 0;
        char action;
        boolean Quit = false;

        // Greet User
        System.out.println("--- Welcome to Simple Bank! ---");

        // Space
        System.out.println(" ");
        System.out.println(" ");


        // Display Available Actions & Balance
        System.out.println("--- AVAILABLE ACTIONS ---");
        System.out.println("Current Balance: $" + balance);
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Quit");


        // Sentinel Loop For Actions (Using Quit Boolean)
        while (!Quit) {

            // Space
            System.out.println(" ");
            System.out.println(" ");

            // Prompt User For Action
            System.out.println("Enter Action: ");
            action = In.next().charAt(0);

            

            // Switch Statement For Action
            switch (action) {

                // Deposit Money
                case '1':
                    System.out.println("Enter Amount To Deposit: ");
                    balance += In.nextDouble();
                    System.out.println("Current Balance: $" + balance);

                    // Display Available Actions & Balance
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("--- AVAILABLE ACTIONS ---");
                    System.out.println("Current Balance: $" + balance);
                    System.out.println("1. Deposit Money");
                    System.out.println("2. Withdraw Money");
                    System.out.println("3. Quit");
                    break;

                // Withdraw Money
                case '2':
                    System.out.println("Enter Amount To Withdraw: ");
                    double withdraw = In.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient Funds!");

                        // Display Available Actions & Balance
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("--- AVAILABLE ACTIONS ---");
                        System.out.println("Current Balance: $" + balance);
                        System.out.println("1. Deposit Money");
                        System.out.println("2. Withdraw Money");
                        System.out.println("3. Quit");

                    } else {
                        balance -= withdraw;
                        System.out.println("Current Balance: $" + balance);

                        // Display Available Actions & Balance
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("--- AVAILABLE ACTIONS ---");
                        System.out.println("Current Balance: $" + balance);
                        System.out.println("1. Deposit Money");
                        System.out.println("2. Withdraw Money");
                        System.out.println("3. Quit");
                    }
                    break;

                // Quit
                case '3':
                    Quit = true;
                    break;

                // Invalid Action
                default:
                    System.out.println("Invalid Action!");
                    break;
            }
        }
       

        In.close(); // CLose Scanner
        
    }
}
