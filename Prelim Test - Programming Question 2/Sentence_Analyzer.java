
import java.util.Scanner;

// CRITERIA
// Analyze Sentence
// Ignore Case Sensitivity
// Handle spaces and non-alphabetic characters properly
// Display the count of vowels and consonants separately

public class Sentence_Analyzer {
    public static void main(String[] args) {
        
        //Create Scanner Instance
       Scanner In = new Scanner(System.in);

        // Variables
        String sentence;
        int vowels = 0;
        int consonants = 0;

        // Greet User
        System.out.println("--- Welcome to Sentence Analyzer! ---");

        // Space
        System.out.println(" ");
        System.out.println(" ");

        // Prompt User For Sentence
        System.out.println("Enter Sentence: ");
        sentence = In.nextLine();

        // Convert Sentence To Lower Case
        sentence = sentence.toLowerCase();

        // Loop Through Sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Check If Character Is An Alphabet
            if (ch >= 'a' && ch <= 'z') {

                // Check If Character Is A Vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Display Results
        System.out.println(" ");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        In.close(); // Close Scanner
    }
}
