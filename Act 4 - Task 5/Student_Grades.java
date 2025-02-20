import java.util.Scanner;

public class Student_Grades {
    public static void main(String[] args) {

        //Scanner
         Scanner In = new Scanner(System.in);
        
        // Student Name Array
        String[] StudentNames = new String[3];

        // Student Grade Array
        float[] StudentGrades = new float[3];

        // Input Student Name And Grade
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Student's Name: ");
            StudentNames[i] = In.nextLine();
            System.out.println("Enter Student's Grade: ");
            StudentGrades[i] = In.nextFloat();
            In.nextLine();
        }

        In.close();

        // Space
        System.out.println(" ");
        System.out.println(" ");

        // Display Student's Name And Grade (Passes If Grade Over 74.5) 
        for (int i = 0; i < 3; i++) {
            System.out.println("Student's Name: " + StudentNames[i] + " Student's Grade: " + StudentGrades[i]);
            System.out.println("Student Passes: " + (StudentGrades[i] > 74.5 ? "Yes" : "No"));
        }
    }
}
