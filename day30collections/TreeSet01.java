package day30collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        /*
        * If you need to use elements in a natural order, then use TreeSet ,
          it will sort elements in ascending order.
        * Hashset is faster than TreeSet but Treeset can order elements
         */

//        TreeSet<Integer>ts1=new TreeSet<>();
//        ts1.add(15);
//        ts1.add(5);
//        ts1.add(2);
//        ts1.add(9);
//        ts1.add(9);
//        ts1.add(13);
//        ts1.add(-9);
//        System.out.println(ts1);

        //Interview Question: How to store unique elements in natural order?
        //We can use TreeSet. But as you know it is slow. How can you make it faster?
        //I will create a HashSet and add all elements to a hashset then I can convert it to a TreeSet

        //2.Way:
        Long t1=System.currentTimeMillis();
        TreeSet<String >ts2=new TreeSet<>();
        ts2.add("K");
        ts2.add("A");
        ts2.add("E");
        ts2.add("T");
        ts2.add("T");
        ts2.add("M");
        System.out.println(ts2);

        Long t2=System.currentTimeMillis();
        //2.Way:
       HashSet<String > hs1=new HashSet<>();
        hs1.add("K");
        hs1.add("A");
        hs1.add("E");
        hs1.add("T");
        hs1.add("T");
        hs1.add("M");
        System.out.println(hs1);
        TreeSet<String>ts3=new TreeSet<>(hs1);
        Long t3=System.currentTimeMillis();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        int arr []={3,2,3,4,1,1,5,7,8,9};
        Set<Integer> set=new HashSet<>();
        for (Integer w:arr ) {
            set.add(w);
        }
        System.out.println(set);





    }
}
