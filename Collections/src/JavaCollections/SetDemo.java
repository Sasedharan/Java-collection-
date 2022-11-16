package JavaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

public static void main(String[] args){
    Set h = new HashSet();
    h.add(111);
    h.add(222);
    h.add(333);
    h.add(444);

    System.out.println(h);                            // un ordered display
    System.out.println(h.add(333));                   // no duplicate allowed ; boolean return type

    LinkedHashSet lh = new LinkedHashSet();
//  lh.addAll(h);
//   System.out.println(lh);                        /* why output print in same order */
    lh.add("one");
    lh.add("three");
    lh.add("five");
    lh.add("ten");
    System.out.println("Linked HashSet Elements " +lh); // for (insertion)ordered display - use linkhashSet interface

}
}