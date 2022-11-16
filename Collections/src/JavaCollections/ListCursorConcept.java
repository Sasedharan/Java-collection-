package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ListCursorConcept {
    public static void main(String[] args) {

        ArrayList q = new ArrayList();
        q.add("youtube");
        q.add("Twitter");
        q.add("Facebook");
        q.add("Snapchat");
        System.out.println("Elements in the List " + q);

        // adding user object as elements in list
        UserdefinedClass us1 = new UserdefinedClass("Yamaha",80000,200);
        UserdefinedClass us2 = new UserdefinedClass("Pulsar",75000, 150);
        q.add(us1);
        System.out.println("Elements in the List " + q);  /* why hash value printed...? */

        // foreach loop - to print one by one -- only print in forward direction , can't modify data,
        for (Object o : q)
            System.out.println(o);

        // Iterator Interface methods
        Iterator i = q.iterator();            // return List object, so object creation required.
        while (i.hasNext())                  // return type is boolean , so used in while statement
        {
            System.out.println("Elements " + i.next());  // cursor present in the before the first element as default.
        }                                                // cursor and foreach loop in single direction.

        // ListIterator methods.
        ListIterator lis = q.listIterator();             // ListIterator moves forward and backward ie. next, previous.
        while (lis.hasNext())
        {
            if(lis.next().equals("Facebook"))
                lis.set("Meta");
        }
        System.out.println("Using set methods " + q);  /* print in array list..? , if lis print means display hashcode*/
    }

//
//    UserdefinedClass us1 = new UserdefinedClass("Yamaha",80000,200);
//    UserdefinedClass us2 = new UserdefinedClass("Pulsar",75000, 150) ;
//    q.add(us1);
}

