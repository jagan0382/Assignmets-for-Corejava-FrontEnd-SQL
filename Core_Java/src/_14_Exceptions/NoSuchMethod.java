
 // 14.Write a program to generate NoSuchMethodException
 
package _14_Exceptions;

import java.lang.reflect.Method;
//creating a class
class E_14 {
    //creating a method which receives two integer values as parameters
    public void addition(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }
}

public class NoSuchMethod {
    public static void main(String[] args) {

        try {
            Class c = Class.forName("Exceptions_14.E_14");
            //There is no subtraction() method in class E_14
            Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
        }
        //Throws NoSuchMethodException
        catch (NoSuchMethodException | ClassNotFoundException e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}

/* O/P -> 		java.lang.NoSuchMethodException: Exceptions_14.E_14.subtraction(int,int)
					at java.base/java.lang.Class.getDeclaredMethod(Class.java:2848)
					at Exceptions_14.NoSuchMethod.main(NoSuchMethod.java:23)
*/