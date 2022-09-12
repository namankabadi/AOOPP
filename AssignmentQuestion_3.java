/*
Name: NAMAN KABADI
USN: 2SD20CS058
PROBLEM STATEMENT:
Write a Java program to perform the following operations:

a) Read a line of text
b) Search for a sub-string SDMCET (case insensitive search)
c) If found, then print success message
d) Otherwise throw an exception SubStringNotFoundException with appropriate message
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class AssignmentQuestion_3 extends Exception {
    public AssignmentQuestion_3(String subStringNotFoundException) {

        System.out.println(subStringNotFoundException);
    }

    public static void main(String[] args) {
        try {
            System.out.println("\nWELCOME TO THE SUBSTRING SEARCHING PROGRAM:\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a line of Text: ");
            String str =sc.nextLine();
            System.out.println("\nYou Entered "+str+" as your Input text.\n");
            String substring = "SDMCET";
            System.out.println("\nThe Substring to be searched in the given text is "+substring+" .\n");
            boolean i=str.equalsIgnoreCase(substring);
            if(i==true){
                System.out.println("SUCCESSFUL IN SEARCHING THE SUBSTRING "+" SDMCET");
            }
            else {
                throw new AssignmentQuestion_3("SubStringNotFoundException");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } catch (AssignmentQuestion_3 e) {
            System.out.println();
        }
    }
}
