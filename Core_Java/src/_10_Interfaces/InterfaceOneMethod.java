
  // 01. Create an interface with only one method and implement it in a class. Call the method

package _10_Interfaces;

//An interface is declared by using the interface keyword.
interface Academy_01 {
    //An abstract method doesn't have its body, and they are public and abstract
    void oneMethod();
}

public class InterfaceOneMethod implements Academy_01 {
    @Override
    public void oneMethod() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        InterfaceOneMethod if1 = new InterfaceOneMethod();
        //Calling the method implemented
        if1.oneMethod();
    }
}


// O/P -> This is a method