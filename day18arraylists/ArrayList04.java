package day18arraylists;

import java.util.ArrayList;

public class ArrayList04 {

    //Increase the value of every element by 3 except 7

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(10);
        list.add(7);
        list.add(9);
        System.out.println(list);

        for(int w : list){

            if(w==7){
                continue;
            }
            list.set(list.indexOf(w), w+3);

        }

        System.out.println(list);
    }
}
