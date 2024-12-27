
// 07. Create an interface and inherit it from the other interface.
 
package _10_Interfaces;
//interface
interface Academy_7 {
    void methodOne();
}

//inherited interface
interface Academy_07 extends Academy_7 {
    void methodTwo();
}

class InheritedInterface implements Academy_07 {
    //override method of interface Academy_07
    @Override
    public void methodOne() {
        System.out.println("This is first method");
    }
    //override method of inherited interface Academy_07
    @Override
    public void methodTwo() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        //creating obj of InheritedInterface
        InheritedInterface if7 = new InheritedInterface();
        //Calling the methods implemented
        if7.methodOne();
        if7.methodTwo();
    }
}


/* O/P -> This is first method
		  This is second method
*/