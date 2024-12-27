
 // 3. Program to equal operator and not equal operators.
 // 4. Write a program to print the odd and even numbers.
 
package _03_Loops;

import java.util.Scanner;

public class Even_And_OddNumbers {

    static void evenNumbers(int n) {
        System.out.println("These are Even Numbers from 0 to " + n);
        
        //loop executes until the condition becomes false
        for (int i = 1; i <= n; i++) {
            //using equal operator ( == )
            //If it is divided by 2,leaves remainder 0 then it is even number
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

    static void oddNumbers(int n) {
        System.out.println("\nThese are Odd Numbers from 1 to " + n);
        
        for (int i = 1; i <= n; i++) {
            // using not equal operator( != )
            // If the remainder is not equal to 0 then given number is odd number
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
       
        num = sc.nextInt();  //input stored in num
        
        evenNumbers(num); //Even Numbers method
        
        oddNumbers(num);//Even Numbers method
    }
}


/* O/P -> 	Enter any Number : 5
			These are Even Numbers from 0 to 5
			2 4  

			These are Odd Numbers from 1 to 5
			1 3 5
			
*/			 