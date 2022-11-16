package JavaCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap hmp = new HashMap();
        hmp.put("abc", 1);
        hmp.put("asd",3);
        hmp.put("qwr",2);
        hmp.put("tyu",4);
        System.out.println(hmp);          // un ordered ; output with flower braces - ie key-value
        System.out.println(hmp.get("abc"));

        Set s = hmp.keySet();            // return type SET - no duplicate occures in key
        System.out.println(s);
        Collection c =hmp.values();      // return type COLLECTION - may contain duplicate
        System.out.println(c);
        Set s1 = hmp.entrySet();         // contain key with value as entry
        System.out.println(s1);

    }
}
