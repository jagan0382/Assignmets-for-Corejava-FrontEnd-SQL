
 /* 5. Define the local and Global variables with the same name and print both variables and
	 understand the scope of the variables */
	

package _01_Basics;

public class Local_Global_Variables {

	    // Instance variable is declared inside the class but outside the body of the method.
	    int a = 11;
	    void localVariable() {
	        //Local variables are declared in methods, constructors, or blocks.
	        int a = 22;
	        System.out.println("Local variable a : " + a);
	    }

	    public static void main(String[] args) {
	    	Local_Global_Variables  obj = new Local_Global_Variables ();
	        System.out.println("Instance variable a : " + obj.a);
	        //calling method()
	        obj.localVariable();
	    }
	    // NOTE : There is no such concept of Global Variables in Java.
		
}

/* O/P =>Instance variable a : 11
		  Local variable a : 22
*/