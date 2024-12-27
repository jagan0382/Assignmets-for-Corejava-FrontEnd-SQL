/*
 * 1. Print the fields/instance members of the current class using this and without using object
 * 3. Call constructor of the current class using this()
 * 4. Call argument constructor of current class using this()
 */
package _11_This_Super;

public class CallUsingThis {

    int num;
    String name;

    CallUsingThis() {
        //3. Calling argument constructor of current class using this()
        this(11, "Sharan");
    }

    CallUsingThis(int num, String name) {
        //1. Printing fields of the current class using this
        this.num = num;
        this.name = name;
        System.out.println(num + " " + name);
    }

    public static void main(String[] args) {
        CallUsingThis ts1 = new CallUsingThis();
        CallUsingThis ts = new CallUsingThis(12, "Jala");
    }
}

/* O/P -> 11 Sharan
		  12 Jala
*/