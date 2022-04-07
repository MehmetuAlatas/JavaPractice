package day33mapsandIterators;

import java.util.*;

public class Iterators01 {
    public static void main(String[] args) {
        List<String > list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        ListIterator list1Itr = list1.listIterator();
        while (list1Itr.hasNext()){
            Object el = list1Itr.next();
            System.out.println(el + " ");
        }
        while (list1Itr.hasPrevious()){
            Object el = list1Itr.previous();
            System.out.println(el + " ");
        }

        /*
        we have
        next() => get elements in ascending order
        previous() => get elements from last index
        hasPrevious() => true or false if element exists from the current pointer to previous ones
        hasNext() => true or false if element exists from first index
        remove() => deletes current element
        set() => update current element

        Iterators: When we use iterators, we can make modifications on collections for multiple data
        Collections: Lists, Sets and so on
         */
        Set<String> set=new HashSet<>();
        set.add("b");
        set.add("s");
        set.add("a");

        Iterator iter=set.iterator();
        while (iter.hasNext()){
            Object element=iter.next();
            System.out.println(element);

        }





    }
}
