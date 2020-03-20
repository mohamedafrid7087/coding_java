package afridcorp;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    // Adding elements into HashSet usind add()// adding duplicate elements
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        if (h.add("India") == false) {
            System.out.println("this is the duplicate Item hence not added");
        }
        System.out.println(h);
        System.out.println("List contains India or not:" +
                h.contains("India"));

        // Removing items from HashSet using remove()
        h.remove("Australia");
        System.out.println("List after removing Australia:" + h);

        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}


