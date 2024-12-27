
 // 10.Write a program to generate ClassNotFoundException
 
package _14_Exceptions;

/* Java ClassNotFoundException occurs when the application tries to load
   a class but Classloader is not able to find it in the classpath.*/
public class ClassNotFound {

    public static void main(String[] args) {

        try {
            Class.forName("Exceptions_14");
            ClassLoader.getSystemClassLoader().loadClass("Exceptions_14");

        } catch (ClassNotFoundException e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}

/* O/P ->   java.lang.ClassNotFoundException: Exceptions_14
			at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
			at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
			at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
			at java.base/java.lang.Class.forName0(Native Method)
			at java.base/java.lang.Class.forName(Class.java:421)
			at java.base/java.lang.Class.forName(Class.java:412)
			at Exceptions_14.ClassNotFound.main(ClassNotFound.java:13)

*/