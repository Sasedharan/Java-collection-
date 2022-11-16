package JavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class genericDemo {
    public static void main(String[] arg){
        LinkedList list = new LinkedList();
        list.add(789);
        list.add(561);
        list.add(231);
        list.add("yu");
        System.out.println(list);

        ArrayList<String> ar = new ArrayList<String>();  // Generic concepts mentioned the  elements in same type
        ar.add("tn");
      //  ar.add(45);
        ar.add("py");
        ar.add("ka");
        ar.add("tl");
        System.out.println(ar);



    }
}
