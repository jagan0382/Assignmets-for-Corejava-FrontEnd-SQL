 // 7. Print the smaller and larger number
	 
package _02_Operators;

public class Larger_Smaller_Numbers {
		
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 15;
	        // Java Ternary operators(?,:) is used as one line replacement for if and else statement
	        int min = (a<b)?a:b;
	        int max = (a>b)?a:b;
	        System.out.println("Smaller Number is " + min);
	        System.out.println("Larger Number is " + max);

	        //Same logic with if and else statements takes more lines to code
	        if (a > b) {
	            System.out.println("Larger Number is " + a);
	        } else {
	            System.out.println("Smaller Number is " + a);
	        }
	        if (b > a) {
	            System.out.println("Larger Number is " + b);
	        } else {
	            System.out.println("Smaller Number is " + b);
	        }
	    }
	}
	

/* O/P -> Smaller Number is 10
		  Larger Number is 15
          Smaller Number is 10
          Larger Number is 15
 
 */
	

