
// 2. Write a java program to print 1 to 20 numbers using the while loop.
 
package _03_Loops;

public class Printing_Numbers {
    public static void main(String[] args) {
        int i = 1;
        //In while loop we separately need to initialize and increment the variable
        //loop executes from 1 to 20
        while (i <= 20) {
            System.out.print(i + " ");
            //Every time the loop body is executed, this expression increments
            i++;
        }
    }
}

// O/P ->1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 