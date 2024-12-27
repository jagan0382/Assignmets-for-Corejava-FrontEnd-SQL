/*
 * 2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
 * - a. Insert a Key value mapping into the map
 * - b. Fetch the value of a Key
 * - c. Create a clone/copy of HashMap
 * - d. Check if the given Key is in the Map
 * - e. Check if the value is in the Map
 * - f. Check if the map is empty
 * - g. Print the size of the Map to the console
 * - h. Print all the Keys of the map to the console
 * - j. Remove a specific Key-value pair
 * - k. Copy all the elements of the Map to another Map
 */


package _16_Collections;
/* Java HashMap class implements the Map interface which allows us
    to store key and value pair, where keys should be unique. */
public class HashMap {
    public static void main(String[] args) {
        //storing key in Integer and value in String
        java.util.HashMap<Integer, String> jala = new java.util.HashMap<>();

        /* If you try to insert the duplicate key, it will
            replace the element of the corresponding key.  */
        //a. Inserting Student ID as Key & Name as value using put() method
        jala.put(1, "Sharan");
        jala.put(2, "Rohit");
        jala.put(3, "Leo");
        jala.put(4, "Keerthana");
        jala.put(5, "Aditya");
        jala.put(6, "Manoj");
        jala.put(7, "Mahideep");
        jala.put(8, "Prapul");
        jala.put(9, "Dheeraj");
        jala.put(10, "Rahul");
        System.out.println("\nkey-value pairs of the Student ID and Name : ");
        System.out.println("jala = " + jala);

        //b. Fetching the value of a Key using get() method
        System.out.println("\nName of the Student with ID no = 6 :");
        System.out.println(jala.get(6));

        //c. Creating a clone/copy of HashMap using clone() method
        System.out.println("\nclone/copy of HashMap jala : ");
        System.out.println(jala.clone());

        //d. Checking if the given Key is in the Map using containsKey() method
        System.out.println("\nID No = 3 is in the Map : ");
        System.out.println(jala.containsKey(3));

        //e. Checking if the value is in the Map using containsValue() method
        System.out.println("\nStudent Name = 'Sharan' is in the map :");
        System.out.println(jala.containsValue("Sharan"));

        //f. Checking if the map is empty using isEmpty() method
        System.out.println("\nChecking if the map is empty :");
        System.out.println(jala.isEmpty());

        //g. Printing the size of the Map to the console using size() method
        System.out.println("\nThe size of the Map is :");
        System.out.println(jala.size());

        //h. Printing all the Keys of the map to the console using keySet() method
        System.out.println("\nAll ID No of the students :");
        System.out.println(jala.keySet());

        //j. Removing a specific Key-value pair using remove() method
        System.out.println("\nRemoved ID no = 2 ,Student name = 'Rohit' : ");
        jala.remove(2, "Rohit");
        System.out.println(jala);

        //k. Copying all the elements of the Map to another Map using puttAll() method
        System.out.println("\nCopied all the elements of the jala to icfai :");

        java.util.HashMap<Integer, String> icfai = new java.util.HashMap<>();

        icfai.putAll(jala);
        System.out.println("icfai = " + icfai);
    }
}

/* O/P ->       key-value pairs of the Student ID and Name : 
				jala = {1=Sharan, 2=Rohit, 3=Leo, 4=Keerthana, 5=Aditya, 6=Manoj, 7=Mahideep, 8=Prapul, 9=Dheeraj, 10=Rahul}
				
				Name of the Student with ID no = 6 :
				Manoj
				
				clone/copy of HashMap jala : 
				{1=Sharan, 2=Rohit, 3=Leo, 4=Keerthana, 5=Aditya, 6=Manoj, 7=Mahideep, 8=Prapul, 9=Dheeraj, 10=Rahul}
				
				ID No = 3 is in the Map : 
				true
				
				Student Name = 'Sharan' is in the map :
				true
				
				Checking if the map is empty :
				false
				
				The size of the Map is :
				10
				
				All ID No of the students :
				[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
				
				Removed ID no = 2 ,Student name = 'Rohit' : 
				{1=Sharan, 3=Leo, 4=Keerthana, 5=Aditya, 6=Manoj, 7=Mahideep, 8=Prapul, 9=Dheeraj, 10=Rahul}
				
				Copied all the elements of the jala to icfai :
				icfai = {1=Sharan, 3=Leo, 4=Keerthana, 5=Aditya, 6=Manoj, 7=Mahideep, 8=Prapul, 9=Dheeraj, 10=Rahul}

 */
