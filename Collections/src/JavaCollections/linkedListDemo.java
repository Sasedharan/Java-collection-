package JavaCollections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class linkedListDemo {
    public static void main(String[] args){
        LinkedList L = new LinkedList();

//        List M = Arrays.asList("bat","ball","stumps",45);  // using asList method to add elements in single statement.
//       // System.out.println(M);
//        M.forEach(Mm -> System.out.println(Mm));           // instead of foreach loop --> here with new syntex used.

        L.add("Mouse");
        L.add("Keyboard");
        L.add("000");
        L.add(333);
        System.out.println("The Element in the List " + L);

        // LINKED LIST METHODS other then ARRAYLIST METHOD - addfirst,addlast,getfirst,getlast,offer,poll,
        L.addFirst("AAA");
        System.out.println("Method using add first " + L);
        L.addLast("KKK");
        System.out.println("Method using add Last " + L);
        L.poll();                                            // acts as remove_first
        System.out.println("After the poll method " + L);
        System.out.println(L.removeLast());
        System.out.println("After Removal" + L);
        System.out.println(L.offer("###"));               // act as addLast & return boolean
        System.out.println("After Offer method" + L);

        LinkedList K = new LinkedList();

        //LINKED LIST METHODS
        System.out.println(" Cloned methods" + L.clone());                       // duplicate
        System.out.println("Using Get Method " +  L.getLast());
    }
}
