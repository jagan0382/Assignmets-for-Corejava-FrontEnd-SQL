
 // 10. Write a program to palindromeNumber or not
 
package _03_Loops;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

        // Variable to store the reversed number
        int reversedNumber = 0;
        int tempNumber = originalNumber;

        // Reverse the number
        while (tempNumber != 0) {
            int digit = tempNumber % 10;          // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            tempNumber = tempNumber / 10;        // Remove the last digit
        }

        // Check if the original number and reversed number are the same
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }

        scanner.close();
    }
}


/* O/P ->Enter a number: 151
		151 is a palindrome number.

 */
