package JavaCollections;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetDemo2 {
    public static void main(String[] arg){
        LinkedList li = new LinkedList();
        li.add(11);
        li.add(22);
        li.add(44);
        li.add(22);
        li.add(55);
        li.add(44);
        System.out.println(li);

        // Use Hashlinked list to avoid duplicate
        LinkedHashSet lihs = new LinkedHashSet();
        lihs.addAll(li);                             // using collection as object.
        System.out.println("Elements using LinkedHashSet " +lihs);
        Object[] o = li.toArray();                     // toArray method return type is OBJECT

        System.out.println("The object converted to array type: ");
        for(Object ob:o)
        {
            System.out.println(ob);
        }
    }
}
