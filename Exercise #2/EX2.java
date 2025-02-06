// Exercise 2: User Input for Arithmetic Operations

// Imports
import java.util.Scanner; // Import Scanner For User Text Input

public class EX2 {
    
    public static void main (String [] args) {

        // Create Scanner Object Instance
        Scanner In = new Scanner(System.in);

        // Initialize Operand Varaibles
        float Op1;
        float Op2;

        // Ask User For Operand Values
        System.out.print("Please Input A Value: ");
        Op1 = In.nextFloat(); // Store Input Into Previously Initialized Float Variables
        System.out.print("Please Input Another Value: ");
        Op2 = In.nextFloat(); // Store Input Into Previously Initialized Float Variables

        // Clear the scanner buffer
        In.nextLine();  // To consume the leftover newline character

        // Perform Operations
        System.out.println("The SUM Of: " + Op1 + " and " + Op2 + " = " + (Op1 + Op2));
        System.out.println("The DIFFERENCE Of: " + Op1 + " and " + Op2 + " = " + (Op1 - Op2));
        System.out.println("The PRODUCT Of: " + Op1 + " and " + Op2 + " = " + (Op1 * Op2));
        System.out.println("The QUOTIENT Of: " + Op1 + " and " + Op2 + " = " + (Op1 / Op2));
        System.out.println("The MODULUS Of: " + Op1 + " and " + Op2 + " = " + (Op1 % Op2));

       // Space
       System.out.println(" "); 

       // Let User Know Operations Are Done
       System.out.println("Operations Completed!!");

       In.close();
    }

}
