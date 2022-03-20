package day18arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList03 {

    //Find the closest 2 integers in the given list. [12, 15, 10, 21]

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(10);

        System.out.println(list);

        //If you want to use list elements use the following code
        Collections.sort(list);
        System.out.println(list);

        //If you want to work with minimum value make the initial value maximum
        int minDiff = Integer.MAX_VALUE;

        //If you need to use consecutive indexes in a loop, make the starting value 1 and use "i-1" nad "i" as indexes
        //If you use starting value as 0 and indexes as "i+1" and "i" you will get error.
        for(int i=1; i<list.size(); i++){
            minDiff = Math.min(minDiff, list.get(i) - list.get(i-1));
        }

        for(int i=1; i<list.size(); i++){
            if(list.get(i) - list.get(i-1) == minDiff){
                System.out.println(list.get(i) + " and " +  list.get(i-1));
            }
        }
    }
}
