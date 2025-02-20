import java.util.Scanner;

public class Post_Pre_Increment_Decrement {
    public static void main(String[] args) {
        
        //Scanner
         Scanner In = new Scanner(System.in);

         // Store Input In Variable
         int number;

        // Prompt And Input
        System.out.println("Enter a number for i: ");
        number = In.nextInt();

        In.close();

        // Print And Perform Operations
        System.out.println("Perform Post Increment (i++): " + number++);
        System.out.println("Perform Pre Increment (++i): " + ++number);
        System.out.println("Perform Post Decrement (i--): " + number--);
        System.out.println("Perform Pre Decrement (--i): " + --number);
    }
}
