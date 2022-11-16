package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class arrayListDemo {
    public static void main(String[] ar) {
        List a = new ArrayList();

        arrayListDemo arrDemo = new arrayListDemo(); // user defined class object creation.

        // wrapping class - technique
        a.add("Ragu");
        a.add("viky");                               // arraylist with different data as object
        a.add("Sam");
        a.add(10);
        a.add("Sam");

        System.out.println(a);

      //  a.add(arrDemo);                            //  user defined class object - also added as object in arraylist.
      //  System.out.println(a);                    /* why display hashcode.? */

        // ARRAY METHODS
        System.out.println(a.size());
        System.out.println(a.contains(10));         // return boolean value
        System.out.println(a.indexOf("Ragu"));
        a.add(2,4587);
        System.out.println(a);


        ArrayList b = new ArrayList();             // creating another object
        System.out.println(b);                     // no input given to arraylist b

        // ARRAY METHODS
        b.add("Cricket");
        b.add("Volleyball");
        b.add("Football");
        b.addAll(1,a);                       // Add all the elements in arraylist a
        System.out.println(b);

        // ARRAY METHODS
        System.out.println(b.isEmpty());           // return boolean value
        b.clear();
        System.out.println(b);
        a.remove(0);                         // remove by using object or index
        System.out.println(a);

        // ARRAY METHODS
        a.remove("Sam");                       // remove the first duplicate element from 0 the index
        System.out.println(a);
    }
}