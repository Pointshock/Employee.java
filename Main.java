package com.company;
//Allows user input
import java.util.Scanner;


public class Main{

    public static void main(String[] args){

        // Make user title scanner obj
        Scanner scanUserTitle = new Scanner (System.in);

        // Ask user for their name
        System.out.println("Please provide your name: ");
        String userTitle = scanUserTitle.nextLine();
        // Welcomes user
        System.out.println("\n\n\t *** Welcome to the employee database " + userTitle + " ***\n");
        // Creates employees
        Employee objEmployee1 = new Employee();
        Employee objEmployee2 = new Employee();

        objEmployee1.setSalary(Float.parseFloat("2100000")); // Set Salary
        objEmployee1.setEmail("christomaskovic9@gmail.com"); // Set Email

        objEmployee2.setSalary(Float.parseFloat("177000")); // Set Salary
        objEmployee2.setEmail("chrtomas@uat.edu"); // Set Email

        // Explains what the program is for
        System.out.println("This is a employee database for JCI\n");

        // put menu of all available actions
        System.out.println("\n\t*** Menu ***");
        System.out.println("1. View Salary");
        System.out.println("2. View Email Address");
        System.out.println("3. Change Salary");
        System.out.println("4. Change Email Address");
        System.out.print("\nPlease enter a menu selection: ");
        // Get menu choice from user
        Scanner scanUserChoice = new Scanner(System.in);
        // Collect int and put value in userChoice.
        int userChoice = scanUserChoice.nextInt();
        // Print blank line
        System.out.println();


        switch (userChoice) {
// View Salary
            case 1 -> {
                // Prints what the user chose
                System.out.println("You've chosen to view salary");
                // Print Salary for employee 1
                System.out.println("Salary of Employee 1: " + (objEmployee1.getSalary()));
                // Print Salary for employee 2
                System.out.println("Salary of Employee 2: " + (objEmployee2.getSalary()));
            }
// View Email
            case 2 -> {
                // Prints what the user chose
                System.out.println("You've chosen to view the email address");
                // Print Email for employee 1
                System.out.println("Email of Employee 1: " + objEmployee1.getEmail());
                // Print Email for employee 2
                System.out.println("Email of Employee 2: " + objEmployee2.getEmail());
            }
// Change Salary
            case 3 -> {
                // Prints what the user chose
                System.out.println("You've chosen to change salary");
                // Unavailable
                System.out.println("This option is temporarily unavailable");
            }
// Change Email
            case 4 -> {
                // Prints what the user chose
                System.out.println("You've chosen to change the email address"); // Splash Text
                System.out.println("This option is temporarily unavailable"); // Unavailable
            }
// Catch bad choice
            default -> System.out.println("Input not a valid menu selection");
        }
    }
}