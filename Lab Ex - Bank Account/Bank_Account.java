import java.util.Scanner;

public class Bank_Account {

    // Variables
    private double balance;

    // Public Constructor to initialize Balance
    public Bank_Account(double balance) {
        this.balance = balance;
    }

    // Public method to deposit money
    public void Deposit(double amount) {
        balance += amount;
        System.out.println("You have deposited: " + amount);
    }

    // Public method to withdraw money
    public void Withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("You have withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Public method to check balance
    public void checkBalance() {
        System.out.println("Your Balance is: " + balance);
    }

    public static void main(String[] args) {

        // Create an instance of Bank_Account
        Bank_Account account = new Bank_Account(0); 

        // Space
        System.out.println(" ");

        // Sentinel Loop For Multiple Transactions
        Scanner In = new Scanner(System.in); // Scanner initialized once
        while (true) {

            // Opener
            System.out.println("--- WELCOME TO THE IRON BANK ---");
            System.out.println(" ");

            // Prompt And Input
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println(" ");
            System.out.print("Enter Action: ");
            int choice = In.nextInt();

            // Space
            System.out.println(" ");

            // Switch Case
            switch (choice) {

                // Call Deposit Method
                case 1:
                    System.out.print("Enter Amount to Deposit: ");
                    double deposit = In.nextDouble();
                    account.Deposit(deposit);
                    break;

                // Call Withdraw Method
                case 2:
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdraw = In.nextDouble();
                    account.Withdraw(withdraw);
                    break;

                // Call Check Balance Method
                case 3:
                    account.checkBalance();
                    break;

                // Exit Loop (Terminate Program)
                case 4:
                    System.out.println("Thank You For Banking With Us!");
                    In.close(); // Closing scanner here
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }

            // Space
            System.out.println(" ");
        }
    }
}
