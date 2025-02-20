import java.util.Scanner;

public class Salary_With_Tax_Suggestion {
    public static void main(String[] args) {

        //Scanner
         Scanner In = new Scanner(System.in);

        
        // Employee's Mame Array
        String[] EmployeeNames = new String[4];

        // Employee's Salary Array
        double[] EmployeeSalaries = new double[4];

        // Input Employee's Name And Salary
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Employee's Name: ");
            EmployeeNames[i] = In.nextLine();
            System.out.println("Enter Employee's Salary: ");
            EmployeeSalaries[i] = In.nextDouble();
            In.nextLine();
        }

        // Space
        System.out.println(" ");
        System.out.println(" ");

        In.close();

        // Display Employee's Name And Salary (Taxed at 20% If Salary Over 10k)

        for (int i = 0; i < 4; i++) {
            System.out.println("Employee's Name: " + EmployeeNames[i] + " Employee's Salary: " + EmployeeSalaries[i]);
            if (EmployeeSalaries[i] > 10000) {
                EmployeeSalaries[i] = EmployeeSalaries[i] - (EmployeeSalaries[i] * 0.2);
                System.out.println("Employee's Salary After Tax: " + EmployeeSalaries[i]);
            }
        }
    }
}
