/*
Author:Naman Kabadi
USN: 2SD20CS058
Theory:
Exceptional Handling:
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal
flow of the application can be maintained.

Types of Java Exceptions:
-->There are mainly two types of exceptions: checked and unchecked. An error is considered as the unchecked exception.
   However, according to Oracle, there are three types of exceptions namely:

   1.Checked Exception 2.Unchecked Exception 3.Error
--->The Keyword used in Exception Handling are try ,catch, throw, throws, finally keywords respectively.

 */

import java.util.Scanner;

public class AssignmentQuestion_1 {
    public static void main(String[] args) {
        System.out.println("\nEXCEPTION HANDLING:\n");
        System.out.println("\nEXCEPTION TYPE 1:\n");
        //taking user input from keyboard and creating the objects for scanner class.
        Scanner sc = new Scanner(System.in);
        try {
            int[] array; //creating an Integer array
            array = new int[10];
            array[11] = 20; // accessing 11th element in an array of
            // size 10
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bound Exception.");
        }
        try {
            System.out.println("\nEXCEPTION TYPE 2:\n");
            System.out.println("Please Enter the value of number 1");
            int number1=sc.nextInt();
            System.out.println("Please Enter the value of number 2");
            int number2=sc.nextInt();
            int result = number1 / number2; // checking for the division
            System.out.println("The Result obtained after the Division operation is: = " + result); //displaying the result
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0 because the value zero is not acceptable");
        }

        System.out.println("\nEXCEPTION TYPE 3:\n");

        // Declaring an variable which
        // holds the input number entered
        int num;

        // Creating a Scanner class object to
        // take input from keyboard
        // System.in -> Keyboard

        // Condition check
        // If condition holds true, Continue loop until
        // valid integer is entered by user
        System.out.println("Condition check Program for a valid integer to be entered by the user. ");
        System.out.println("Program LOOPS until a valid integer is entered by the user.");
        while (true) {

            // Display message
            System.out.println("Enter any valid Integer: ");

            // Try block to check if any exception occurs
            try {

                // Parsing user input to integer
                // using the parseInt() method
                num = Integer.parseInt(sc.next());

                // Number can be valid or invalid

                // If number is valid, print and display
                // the message and number
                System.out.println("You entered: "
                        + num);

                // Get off from this loop
                break;
            }

            // Catch block to handle NumberFormatException
            catch (NumberFormatException e) {

                // Print the message if exception occurred
                System.out.println(
                        "NumberFormatException occurred");
            }
        }
    }
}
