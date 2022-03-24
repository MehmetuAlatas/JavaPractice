package day30collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSet01 {
    public static void main(String[] args) {

        LinkedHashSet<Integer>lhs1=new LinkedHashSet<>();
        lhs1.add(12);
        lhs1.add(33);
        lhs1.add(10);
        lhs1.add(5);
        lhs1.add(32);
        lhs1.add(12);
        System.out.println(lhs1);

        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //Interview Question: Display all arraylist elements at once on the console
        LinkedHashSet<Integer>lhs2=new LinkedHashSet<>(list);
        System.out.println(lhs2);





    }
}
