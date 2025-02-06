// Activity 3-4 Dynamic POS System

import java.util.Scanner; // Import Scanner For User Text Input

public class POS {
    public static void main(String[] args) throws Exception {
        // Create Scanner Object Instance
        Scanner In = new Scanner(System.in);
        
        // Initialize The Size Variable For Our Dynamic Arrays
        int Size;
        float TOTAL = 0;
        float Payment = 0;
        float Change = 0;

        // Ask The User For Input
        System.out.print("How Many Items Do You Want To Checkout? "); // Prompt User
        // Insert Input Into Previously Initialized Size Variable
        Size = In.nextInt();
        In.nextLine(); // Consume the newline character

        // Create The Arrays
        String[] ItemName = new String[Size];
        float[] ItemAmount = new float[Size];
        float[] ItemPrice = new float[Size];

        // Loop For Item Names (For Loop)
        for (int i = 0; i < Size; i++) {
            System.out.print("Enter Item Name For Index " + i + ": ");
            ItemName[i] = In.nextLine();
        }

        // Loop For Item Amount (For Loop)
        for (int i = 0; i < Size; i++) {
            System.out.print("Enter Amount Of " + ItemName[i] + ": ");
            ItemAmount[i] = In.nextFloat();
        }

        // Loop For Item Price (For Loop)
        for (int i = 0; i < Size; i++) {
            System.out.print("Enter (Per Piece) Price Of " + ItemName[i] + " : ");
            ItemPrice[i] = In.nextFloat();
        }

        // Space
        System.out.println(" ");
        System.out.println(" ");

        // Bill
        System.out.println("--- Purchase Bill ---");

        // Loop For Items Bill (For Loop)
        for (int i = 0; i < Size; i++) {
            System.out.println( ItemName[i] + " - " + ItemAmount[i] + " * " + ItemPrice[i] + " = " + (ItemAmount[i] * ItemPrice[i]));
        }

        // Space
        System.out.println(" ");
        System.out.println(" ");

        // Calculate Total Bill
        for (int i = 0; i < Size; i++) {
            TOTAL += ItemAmount[i] * ItemPrice[i];
        }

        // Show Total
        System.out.println("Total Cost: " + TOTAL);

        System.out.println("--- * ---");

        // Payment (Do while loop)
        do {
            System.out.print("Enter Payment Amount: ");
            Payment = In.nextFloat();
            if (Payment < TOTAL) {
                System.out.println("Payment Insufficient. Please enter a valid amount.");
            } else {
                Change = Payment - TOTAL;
                System.out.println(" ");
                System.out.println(" ");
            }
        } while (Payment < TOTAL);

        // Print Final Receipt
        System.out.println("--- OFFICIAL RECEIPT ---");
        for (int i = 0; i < Size; i++) {
            System.out.println( ItemName[i] + " - " + ItemAmount[i] + " * " + ItemPrice[i] + " = " + (ItemAmount[i] * ItemPrice[i]));
        }

        // Space
        System.out.println(" ");
        System.out.println(" ");

        // Computations
        System.out.println("Total Cost: " + TOTAL);
        System.out.println("Payment Made: " + Payment);
        System.out.println("Change: " + Change);
        System.out.println("--- Transaction Complete ---");

        // Space
        System.out.println(" ");
        System.out.println(" ");

        In.close();
    }
}
