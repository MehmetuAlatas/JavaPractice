package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String>ll1=new LinkedList<>();
        ll1.add("Ali");
        ll1.add("can");
        ll1.add("veli");
        ll1.add("sese");
        ll1.add("eka");
//        System.out.println(ll1);
//        String firstelement = ll1.element();//returns the first element of the list without removing any element
//        System.out.println(firstelement);
//        System.out.println(ll1);

        String firstelement2=ll1.poll();//returns the first element but removing the element from the list (cut + paste)
        System.out.println(ll1);

        String firstelement3 =ll1.peek();//returns the first element without removing the element (copy+paste)
        System.out.println(firstelement3);

        LinkedList<String>ll2=new LinkedList<>();

     //   System.out.println(ll2.element());//returns NosuchElementException---for testers**********important

      //  System.out.println(ll2.peek());//this returns just a null if there is no value

       // System.out.println(ll2.poll());


        LinkedList<Integer>ll3=new LinkedList<>();

        ll3.add(0,12);// when ı want to use order for the elements ı can place at specific indexes my list elements
        ll3.add(1,13);
        ll3.add(2,10);
        ll3.add(3,11);
        System.out.println(ll3);
       Integer first1= ll3.remove();//retrieve the first element and will remove it from the list
        System.out.println(first1);
        System.out.println(ll3);

        Integer first2=ll3.remove(2);//retrieve the first element and will remove it from the list
        System.out.println(first2);
        System.out.println(ll3);






    }








}
