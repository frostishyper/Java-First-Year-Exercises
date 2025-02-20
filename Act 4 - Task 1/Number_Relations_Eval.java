    import java.util.Scanner;

    public class Number_Relations_Eval {
        public static void main(String[] args) {

            //Scanner
            Scanner In = new Scanner(System.in);

            // Arrray To Store Inputs
            int[] numbers = new int[12];

            // Prompt And Input
            System.out.println("Input 12 numbers: ");
            for (int i = 0; i < 12; i++) {
                numbers[i] = In.nextInt();
            }

            // Space
            System.out.println(" ");
            System.out.println(" ");

            // Display Number Relations
            System.out.println("1st Number: " + numbers[0] + " 2nd Number: " + numbers[1]);
            if (numbers[0] == numbers[1]) {
                System.out.println("Equal");
            } else if (numbers[0] < numbers[1]) {
                System.out.println("Less than");
            } else {
                System.out.println("Greater than");
            }

            // Space
            System.out.println(" ");
            System.out.println(" ");

            System.out.println("3rd Number: " + numbers[2] + " 4th Number: " + numbers[3]);
            if (numbers[2] == numbers[3]) {
                System.out.println("Equal");
            } else if (numbers[2] < numbers[3]) {
                System.out.println("Less than");
            } else {
                System.out.println("Greater than");
            }

            // Space
            System.out.println(" ");
            System.out.println(" ");

            System.out.println("5th Number: " + numbers[4] + " 6th Number: " + numbers[5]);
            if (numbers[4] == numbers[5]) {
                System.out.println("Equal");
            } else if (numbers[4] < numbers[5]) {
                System.out.println("Less than");
            } else {
                System.out.println("Greater than");
            }

            // Space
            System.out.println(" ");
            System.out.println(" ");

            System.out.println("7th Number: " + numbers[6] + " 8th Number: " + numbers[7]);
            if (numbers[6] == numbers[7]) {
                System.out.println("Equal");
            } else if (numbers[6] < numbers[7]) {
                System.out.println("Less than");
            } else {
                System.out.println("Greater than");
            }

            // Space
            System.out.println(" ");
            System.out.println(" ");

            System.out.println("9th Number: " + numbers[8] + " 10th Number: " + numbers[9]);
            if (numbers[8] == numbers[9]) {
                System.out.println("Equal");
            } else if (numbers[8] < numbers[9]) {
                System.out.println("Less than");
            } else {
                System.out.println("Greater than");
            }

            // Space
            System.out.println(" ");
            System.out.println(" ");

            System.out.println("11th Number: " + numbers[10] + " 12th Number: " + numbers[11]);
            if (numbers[10] == numbers[11]) {
                System.out.println("Equal");
            } else if (numbers[10] < numbers[11]) {
                System.out.println("Greater than");
            }
            

            In.close();
        }
    }
