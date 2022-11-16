package JavaCollections;

import java.util.Arrays;

public class ArrayUtilPackage {
    public static void main(String[] args){
        int[] a = {21,11,51,33,22};
        String[] st = new String[5];
        st[0]="Venky";
        st[1]="Anbu";
        st[2]="Chandru";
        st[3]="Billa";
        st[4]="Padayappa";
        Arrays.sort(a);
        System.out.println("Sorted order");
        for(int i : a){
            System.out.println(i);
        }
         Arrays.sort(st);
        System.out.println("Object - String Sorted ");
        for(String s : st){
            System.out.println(s);
        }
        ArrayUtilPackage aup = new ArrayUtilPackage();

    }
}
