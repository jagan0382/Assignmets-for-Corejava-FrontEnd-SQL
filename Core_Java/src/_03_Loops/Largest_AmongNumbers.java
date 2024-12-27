
 //  5. Write a program to print largest number among three numbers.
 
package _03_Loops;

import java.util.Scanner;

public class Largest_AmongNumbers {
    public static void main(String[] args) {

        int a, b, c;
        Scanner num = new Scanner(System.in);
        //inputs are stored in a,b,c.
        System.out.print("Enter First Number : ");
        a = num.nextInt();
        System.out.print("Enter Second Number : ");
        b = num.nextInt();
        System.out.print("Enter Third Number : ");
        c = num.nextInt();

        //Executes if a is largest
        if ((a > b) && (a > c)) {
            System.out.println("The Largest Number is : " + a);
        }
        //Executes if b is largest
        else if ((b > a) && (b > c)) {
            System.out.println("The Largest Number is : " + b);
        }
        //Executes if a,b are not largest
        else {
            System.out.println("The Largest Number is : " + c);
        }
    }
}


/* O/P -> Enter First Number : 3
		  Enter Second Number : 5
		  Enter Third Number : 6
		  The Largest Number is : 6
*/