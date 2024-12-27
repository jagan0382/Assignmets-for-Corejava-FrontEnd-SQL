/*
 * 01. Create an abstract class with abstract and non-abstract methods.
 * 02. Create a subclass for an abstract class. Create an object in the child class for the abstract class and access the non-abstract methods
 * 03. Create an instance for the child class in child class and call abstract methods
 * 04. Create an instance for the child class in child class and call non-abstract methods
 */
package _09_Abstract;

// Abstract class definition
abstract class Animal {
    // Abstract method without a body
    abstract void sound();

    // Non-abstract method with implementation
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass for the abstract class
class Lion extends Animal {
    // Providing implementation for the abstract method
    @Override
    void sound() {
        System.out.println("Lion roars");
    }

    public static void main(String[] args) {
        // Creating an object of the abstract class using the child class
        Animal animal = new Lion();

        // Accessing the non-abstract method through the abstract class reference
        animal.eat();

        // Creating an instance of the child class
        Lion lion = new Lion();

        // Calling the abstract method
        lion.sound();

        // Calling the non-abstract method
        lion.eat();
    }
}