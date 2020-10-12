package java_core.collection9.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Mari");
        a.add("Petr");
        a.add("Kate");

        List<String> b = new LinkedList<>();
        b.add("Garry");
        b.add("Bob");
        b.add("Larry");
        b.add("Tom");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.listIterator();

        while (bIter.hasNext()){
            if(aIter.hasNext())aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);

        //remove each second word from b list
        bIter = b.iterator();
        while (bIter.hasNext()){
            bIter.next();
            if(bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }

        }
        System.out.println(b);

        a.removeAll(b);
        System.out.println(a);
    }
}
