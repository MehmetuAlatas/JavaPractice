package day17multidimensionalarrayslists;

import java.util.ArrayList;

public class Lists02 {

    public static void main(String[] args) {

        //Create an Integer List and add 5 elements into it
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(5);
        al1.add(6);
        al1.add(7);
        al1.add(8);
        al1.add(9);
        System.out.println(al1);// [5, 6, 7, 8, 9]

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(98);
        al2.add(99);

        al1.addAll(al2);
        System.out.println(al1);// [5, 6, 7, 8, 9, 98, 99]

        al2.addAll(al1);
        System.out.println(al2);// [98, 99, 5, 6, 7, 8, 9, 98, 99]

        ArrayList<Integer> al3 = new ArrayList<>();
        al3.add(111);
        al3.add(222);

        al2.addAll(4, al3);
        System.out.println(al2);// [98, 99, 5, 6, 111, 222, 7, 8, 9, 98, 99]

        al2.removeAll(al1);
        System.out.println(al2);// [111, 222]

        boolean b1 = al1.contains(98);//true
        System.out.println("Does 98 exist? " + b1);

        al2.clear();
        System.out.println(al2);// []

        al1.set(5, 999);
        System.out.println(al1);// [5, 6, 7, 8, 9, 999, 99]

        //Change the elements less than 10 to 777
        //1.Way:
        for(Integer w : al1){
            if(w<10){
                al1.set(al1.indexOf(w), 777);
            }
        }
        System.out.println(al1);// [777, 777, 777, 777, 777, 999, 99]

        //2.Way:
        for(int i=0; i<al1.size(); i++){
            if(al1.get(i)<10){
                al1.set(i, 777);
            }
        }
        System.out.println(al1);// [777, 777, 777, 777, 777, 999, 99]

        ArrayList<String> sl1 = new ArrayList<>();
        sl1.add("Java");
        sl1.add("Lambda");

        ArrayList<String> sl2 = new ArrayList<>();
        sl2.add("Java");
        sl2.add("Lambda");

        boolean r1 = sl1.equals(sl2);//true
        System.out.println(r1);//true
    }
}
