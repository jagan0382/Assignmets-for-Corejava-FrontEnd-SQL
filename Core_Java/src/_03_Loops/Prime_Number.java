
 // 9. Write a program to find the primeNumber or not.

package _03_Loops;

import java.util.Scanner;


public class Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Loop to check divisors
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit loop if a divisor is found
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}


/* O/P -> Enter a number: 5
		  5 is a prime number.
 */


