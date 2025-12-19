package Assignment;

import java.util.Scanner;

public class FirstAssignnent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number (num1): ");
        int num1 = input.nextInt();

        System.out.print("Enter second number (num2): ");
        int num2 = input.nextInt();

        //1/Arithmetic operations

       System.out.println("Arithmetic Operations");
       System.out.println("Sum: " + (num1 + num2));
       System.out.println("Difference: " + (num1 - num2));
       System.out.println("Product: " + (num1 * num2));
       System.out.println("Remainder: " + (num1 % num2));

       //2/ If conditions
        System.out.println("\n--- Comparison ---");
        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
          } else if (num2 > num1) {
             System.out.println(num2 + " is greater.");
            } else {
            System.out.println("The numbers are equal.");
        }
            //3/Logical Operators

        System.out.println("\n--- Positivity Check ---");
        if (num1 > 0 && num2 > 0) {
            System.out.println("Both are positive");
          } else if (num1 > 0 || num2 > 0) {
            System.out.println("One is positive");
        } else {
            System.out.println("No positives");
        }

       //4/ Ternary operator
        System.out.println("\n--- Ternary Operators ---");
        // Print greater number
        String greater = (num1 > num2) ? num1 + " is greater" : num2 + " is greater";
        System.out.println(greater);

        // Print if num1 is even or odd
        String evenOdd = (num1 % 2 == 0) ? num1 + " is even" : num1 + " is odd";
        System.out.println(evenOdd);
        }
    }


