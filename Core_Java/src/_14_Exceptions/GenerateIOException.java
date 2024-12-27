
 // 12. Write a program to generate IOException
 
package _14_Exceptions;

import java.io.*;

//IOExceptions are thrown when there is any input / output file operation issues
public class GenerateIOException {
    public static void main(String[] args) {

        File file = new File("test.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            fis.read();
            fis.close();
        }
        //FileNotFoundException is a subclass of IOException.
        catch (IOException e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}


/* O/P ->       java.io.FileNotFoundException: test.txt (The system cannot find the file specified)
				at java.base/java.io.FileInputStream.open0(Native Method)
				at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
				at Exceptions_14.GenerateIOException.main(GenerateIOException.java:15)
*/