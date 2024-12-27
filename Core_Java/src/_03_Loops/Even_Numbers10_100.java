//  6. Write a program to print even number between 10 and 100 using while
 
package _03_Loops;

public class Even_Numbers10_100 {
    public static void main(String[] args) {

        System.out.println("The Even Numbers between 10 and 100 are : ");
        int i = 10;
        
        //loop executes from 10 to 100
        while (i <= 100) {
            System.out.println(i);
            i += 2;
        }
    }
}


/* O/P ->
			The Even Numbers between 10 and 100 are : 
			10
			12
			14
			16
			18
			20
			22
			24
			26
			28
			30
			32
			34
			36
			38
			40
			42
			44
			46
			48
			50
			52
			54
			56
			58
			60
			62
			64
			66
			68
			70
			72
			74
			76
			78
			80
			82
			84
			86
			88
			90
			92
			94
			96
			98
			100
			*/
