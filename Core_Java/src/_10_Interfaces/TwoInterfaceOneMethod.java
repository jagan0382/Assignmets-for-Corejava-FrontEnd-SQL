/*
 * 04.Create two interfaces with one method each. Implement these two interfaces in one class.
 */
package _10_Interfaces;

//interface 1
interface Academy_4 {
    void methodOne();
}

//interface 2
interface Academy_04 {
    void methodTwo();
}

//Implemented these two interfaces in one class
public class TwoInterfaceOneMethod implements Academy_4, Academy_04 {
    @Override
    public void methodOne() {
        System.out.println("This is Method one");
    }

    @Override
    public void methodTwo() {
        System.out.println("This is Method two");
    }

    //main method
    public static void main(String[] args) {
        TwoInterfaceOneMethod if4 = new TwoInterfaceOneMethod();
        //Calling the methods implemented
        if4.methodOne();
        if4.methodTwo();
    }
}