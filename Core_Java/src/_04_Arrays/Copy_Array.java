
 // 6. Write a function to copy an array to another array
 
package _04_Arrays;

import java.util.*;

public class Copy_Array {

    //function to copy an array to another array
    //creating a method which receives an array as parameter
    static void copyingArray(int[] arr) {
        //copies given arr array to copy array
        int[] copy = arr;
        //prints the copied array
        System.out.println("Array after copying to c = " + Arrays.toString(copy));
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        //user input
        System.out.print("Enter the number of elements you want to store : ");
        n = sc.nextInt();
        //no of elements to store
        System.out.println("Enter the Elements of the array ");
        ///new array
        int[] my_arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("my_arr[%d] = ", i);
            //Elements input
            my_arr[i] = sc.nextInt();
        }
        System.out.println("my_arr = " + Arrays.toString(my_arr));
        //passing Array to copy to another array
        copyingArray(my_arr);
    }
}

/* O/P ->   Enter the number of elements you want to store : 5
			Enter the Elements of the array 
			my_arr[0] = 5
			my_arr[1] = 2
			my_arr[2] = 8
			my_arr[3] = 9
			my_arr[4] = 5
			my_arr = [5, 2, 8, 9, 5]
			Array after copying to c = [5, 2, 8, 9, 5]
 
 */


