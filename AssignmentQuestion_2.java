/*
Author:Naman Kabadi
USN: 2SD20CS058
PROBLEM STATEMENT:
Write a Java program to read an integer and check whether the number is prime or not. If negative number is entered,
throw an exception NegativeNumberNotAllowedException and if entered number is not prime, then throw
NumberNotPrimeException.

 */


import java.util.InputMismatchException;
import java.util.Scanner;


public class AssignmentQuestion_2 extends Exception {
    

    public AssignmentQuestion_2(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        int i, m = 0, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPRIME AND NEGATIVE NUMBER EVALUATION:\n");
        System.out.println("Please enter a valid Number:");
        int num;
        try {
            num = sc.nextInt();
            int result = Integer.signum(num);
            int num1;
            if (num < 0) {
                System.out.println("Number "+num+" is negative Number.");
                num1 = num * (-1);
            } else if (num == 0) {
                System.out.println(num + " is not prime number");
            }else if (num == 1) {
                System.out.println(num + " is not prime number");
            }else {
                for (i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        System.out.println(num + " is not prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(num + " is prime number");
                }
            }//end of else

        }
        catch (InputMismatchException | NumberFormatException e) {
            System.out.println();
        }
        try {
            System.out.println("Input The Number For sign checking:");
            num = sc.nextInt();
            int result = Integer.signum(num);
            if (result == 1) {
                throw new AssignmentQuestion_2("Positive Number is Being Detected");
            } else if (result == 0) {
                throw new AssignmentQuestion_2("Number Zero is Being Detected");
            } else {
                throw new AssignmentQuestion_2("NegativeNumberNotAllowedException");
            }
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Invalid Input.");
        } catch (AssignmentQuestion_2 e) {
            System.out.println(" ");
        }
    }
}
