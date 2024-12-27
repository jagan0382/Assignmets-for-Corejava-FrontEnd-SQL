
 // 3.Write a method which throws exception, Call that method in main class without try block
 
package _14_Exceptions;
/* We can throw either checked or unchecked exceptions in Java by throw keyword.
It is mainly used to throw a custom exception. */
public class MethodThrowsException {
    static void throwException() {
        //throw keyword is used to invoke an exception explicitly.
        throw new RuntimeException("Throwing exception");
    }

    public static void main(String[] args) {
        //Calling method in main class without try block
        throwException();
    }
}

/* O/P -> 		Exception in thread "main" java.lang.RuntimeException: Throwing exception
					at Exceptions_14.MethodThrowsException.throwException(MethodThrowsException.java:10)
					at Exceptions_14.MethodThrowsException.main(MethodThrowsException.java:15)
*/