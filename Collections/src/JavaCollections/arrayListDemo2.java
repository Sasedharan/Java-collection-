package JavaCollections;

import java.util.ArrayList;
import java.util.List;
public class arrayListDemo2 {
    public static void main(String[] args) {
        List l = new ArrayList();                // Dynamic Binding - technique
        l.add("Car");
        l.add("Bike");
        l.add("150cc");
        l.add("Cycle");

        System.out.println(l);

        List m = new ArrayList();                // creating 2nd object
        m.add(123);
        m.add(789);
        m.add(456);
        m.add(963);
        m.add(123);
        System.out.println(m);

        //ARRAY METHODS
        l.addAll(2,m);
        System.out.println(l.remove("Car")); // return boolean value by using object to remove.
        System.out.println(l);
      //  l.removeAll(m);                       // remove all elements from m
        l.retainAll(m);                         // only take m elements ;  l elements not printed
        System.out.println(l);
        System.out.println(l.set(2,"Running")); // by using print statement - the older element returned(contain return ste)
        System.out.println(l);                  // Overwrite the element value ; old elements got erased

        // ARRAY METHODS
        System.out.println("Before Sublist method " +m);
        List m1 = m.subList(0,2);
        List m2 = m.subList(2,2);                /* Return type in List , so we stored in List class
                                                 From index added but last index excluded ,so 0 th and 1 st printed*/
        System.out.println("After the Sublist method  " + m1 + "," + "If Same Index given " + m2);

        // ARRAY METHODS
        System.out.println("Before last index check " + m);

        System.out.println("After the Index of method " + m.lastIndexOf(123));
    }
}
