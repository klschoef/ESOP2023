package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class PerfTest {
    public static void main(String[] args) {
        //Vector (wird immer um doppelte Größe erweitert)
        long startms = System.currentTimeMillis();
        Vector<String> v = new Vector<>();
        for (int i = 0; i < 10000000; i++) {
            v.add("" + i);
        }
        System.out.println(v.elementAt(v.size()/2));
        long endms = System.currentTimeMillis();
        System.out.println("Vector time: " + (endms - startms));


        //Arraylist (wird immer um 1.5x Größe erweitert)
        long startms2 = System.currentTimeMillis();
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            al.add("" + i);
        }
        System.out.println(al.get(al.size()/2));
        long endms2 = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (endms2 - startms2));


        //LinkedList
        long startms3 = System.currentTimeMillis();
        LinkedList<String> ll = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            ll.add("" + i);
        }
        System.out.println(ll.get(ll.size()/2));
        long endms3 = System.currentTimeMillis();
        System.out.println("LinkedList time: " + (endms3 - startms3));
    }
}
