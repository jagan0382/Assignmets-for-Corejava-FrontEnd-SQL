
 // 15.Write a program to generate NullPointerException
 
package _14_Exceptions;
/* NullPointerException :
This exception is raised when referring to the members of a null object. Null represents nothing */
public class NullPointer {
    //we are trying to perform the length() operation on str which is null
    static void simpleNullCheck(String str) {
        System.out.println(str.length());
    }

    public static void main(String args[]) {

        String input = null;
        try {
            simpleNullCheck(input);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}


/* O/P -> 		NullPointerException caught!
				java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
					at Exceptions_14.NullPointer.simpleNullCheck(NullPointer.java:10)
					at Exceptions_14.NullPointer.main(NullPointer.java:17)
*/