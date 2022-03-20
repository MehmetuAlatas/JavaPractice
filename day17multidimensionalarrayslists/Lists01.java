package day17multidimensionalarrayslists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

    /*
        1) When you create an array you have to declare the length otherwise you cannot create an array
        2) After declaring the length it is impossible to store more elements in it, this is not good.
        3) Java created another structure to store multiple elements, it is "ArrayLists".
           ArrayLists are flexible in length. It means while you create an ArrayList no need to declare the length.
           After creating ArrayList you may store any number of elements, there is no any restriction about it.
        4) Arrays can contain "primitive" data types and "references" but ArrayLists can contain just "non-primitive" data types
           int ==> Array but Integer ==> ArrayList
     */

    public static void main(String[] args) {

        //How to create an ArrayList
        //1.Way:
        ArrayList<Integer> al1 = new ArrayList<>();

        //2.Way:
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        //3.Way:
        List<Integer> al3 = new ArrayList<>();

        //How  to print an ArrayList on the console
        System.out.println(al1);// []

        //How  to add elements into a ArrayList
        //Note: add() method puts the elements in ArrayList according to the insertion order
        al1.add(11);
        al1.add(5);
        al1.add(12);
        System.out.println(al1);// [11, 5, 12]

        al1.add(1, 99);
        System.out.println(al1);// [11, 99, 5, 12]

        //How to get the number of elements in an ArrayList
        int numOfElements = al1.size();
        System.out.println(numOfElements);//4

        System.out.println(al2.size());// 0

        //Note: When you talk about the number of elements in an "Array" tell "Array length"
        //Note: When you talk about the number of elements in an "ArrayList" tell "List size"

        //How to check if an ArrayList is empty or not
        //1.Way:
        if(al1.size()==0){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }

        //2.Way
        if(al2.isEmpty()){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }

        //How to check if an ArrayList has space in it
        List<String> al4 = new ArrayList<>();
        al4.add("a");
        al4.add(" ");
        for(String w : al4){
            if(w.equals(" ")){
                System.out.println("There is space");
                break;
            }
        }

        //Create a String ArrayList, add 5 elements into it, remove a specific element
        List<String> al5 = new ArrayList<String>();
        al5.add("Christian");
        al5.add("Alex");
        al5.add("Tommy");
        al5.add("Adriana");
        al5.add("Tom");
        System.out.println(al5);// [Christian, Alex, Tommy, Adriana, Mary]

        al5.remove("Alex");//It will return boolean. true==>mission completed - false==>Could not remove
        System.out.println(al5);// [Christian, Tommy, Adriana, Mary]

        //How  to remove an element by index
        al5.remove(1);//It will return the removed element to double-check
        System.out.println(al5);// [Christian, Adriana, Mary]

        //Create an Integer ArrayList, add 5 elements into it, remove a specific element
        ArrayList<Integer> al6 = new ArrayList<>();
        al6.add(12);
        al6.add(13);
        al6.add(7);
        al6.add(32);
        al6.add(1);
        System.out.println(al6);//[12, 13, 7, 32, 1]

        //When you have Integers to remove, you have to use remove() method with index, remove() method with element cannot be used
        al6.remove(1);
        System.out.println(al6);//[12, 7, 32, 1]

        //How to remove a specific integer element from an integer list

        //1.Step:Create an Integer Wrapper Class Object by using the value which you want to remove
        Integer el = Integer.valueOf(32);
        //2.Step: Use the created Integer object inside the remove()
        al6.remove(el);
        System.out.println(al6);//[12, 7, 1]

        //Create a String ArrayList, add 5 elements into it, remove the elements whose lengths are less than 5
        List<String> al7 = new ArrayList<String>();
        al7.add("Christian");
        al7.add("Alex");
        al7.add("Tommy");
        al7.add("Adriana");
        al7.add("Tom");
        System.out.println(al7);//      [Christian, Alex, Tommy, Adriana, Mary]

        //Clone the al7 and use the cloned ArrayList inside the loop
        List<String> clonedAl7 = new ArrayList<String>(al7);//           [Christian, Alex, Tommy, Adriana, Mary]

        for(String w : clonedAl7){// clonedAl7 = [Christian, Alex, Tommy, Adriana, Mary]
            if(w.length()<5){
                al7.remove(w);
            }
        }
        System.out.println(al7);// [Christian, Tommy, Adriana]

    }
}
