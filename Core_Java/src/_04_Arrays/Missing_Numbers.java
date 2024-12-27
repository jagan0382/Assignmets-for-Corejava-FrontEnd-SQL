
 // 19. Write a function to find the missing number of sorted array of 1 to 100
 
package _04_Arrays;

import java.util.Arrays;

public class Missing_Numbers {
	
    //method to find the missing number of sorted array of 1 to 100
    //creating a method which receives an array as parameter
    static void missingNumber(int[] arr) {
        //Sorting Array
        Arrays.sort(arr);
        System.out.println("a[] = " + Arrays.toString(arr));
        int j = 0;
        for (int i = 1; i < 40; i++) {
            if (j < arr.length && i == arr[j])
                j++;
            else
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        //declaring and initializing an array
        int[] my_arr = {10, 20, 30};
        //passing array to method
        missingNumber(my_arr);
    }
}



/* O/P => a[] = [10, 20, 30]
		  1 2 3 4 5 6 7 8 9 11 12 13 14 15 16 17 18 19 21 22 23 24 25 26 27 28 29 31 32 33 34 35 36 37 38 39 
*/