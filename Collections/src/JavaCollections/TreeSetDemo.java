package JavaCollections;

import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] arg){
        TreeSet t = new TreeSet();             // sorting set
        t.add(56);
        t.add(19);
        t.add(8);
        t.add(8);                              // set means no duplicate. so not taken
        t.add(3);
        System.out.println(t);                 // Ascending order by default

        // Linkedlist usage
        LinkedList lt = new LinkedList();
        lt.add(5);
        lt.add(2);
        lt.add(1);
        lt.add(0);
        lt.add(1);
        System.out.println("Before using tree-set " +lt);
        TreeSet t1 = new TreeSet(lt);                        // linkedlist into treeset
        System.out.println("After using TreeSet " + t1);



    }
}
