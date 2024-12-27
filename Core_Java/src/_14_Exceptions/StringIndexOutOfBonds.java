
 // 17. Write a program to generate StringIndexOutOfBoundsException
 
package _14_Exceptions;
/* StringIndexOutOfBoundsException :
It is thrown by String class methods to indicate that an index is
either negative or greater than the size of the string */
public class StringIndexOutOfBonds {
    public static void main(String[] args) {

        String str = "Sharan";
        try {
            // Trying to access at negative index
            char charAtNegativeIndex = str.charAt(-1);
            // Trying to access at index equal to size of the string
            char charAtLengthIndex = str.charAt(11);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("StringIndexOutOfBoundsException caught");
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}

/* O/P ->   StringIndexOutOfBoundsException caught
			java.lang.StringIndexOutOfBoundsException: Index -1 out of bounds for length 6
					at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
					at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
					at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
					at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
					at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
					at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
					at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
					at java.base/java.lang.String.checkIndex(String.java:4828)
					at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
					at java.base/java.lang.String.charAt(String.java:1555)
					at Exceptions_14.StringIndexOutOfBonds.main(StringIndexOutOfBonds.java:14)

*/