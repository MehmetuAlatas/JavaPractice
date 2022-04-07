package day33mapsandIterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {

        TreeMap<String,Integer>tm1=new TreeMap<>();

        tm1.put("Ali",3000);
        tm1.put("Tom",500);
        tm1.put("Alexandra",12000);
        tm1.put("Mark",5000);
        tm1.put("Angelina",23000);
        tm1.put("Walker",null);
        tm1.put("Talker",null);

        System.out.println(tm1);

         HashMap<String,Integer>hm1=new HashMap<>();

        hm1.put("Ali",3000);
        hm1.put("Tom",500);
        hm1.put("Alexandra",12000);
        hm1.put("Mark",5000);
        hm1.put("Angelina",23000);
        hm1.put("Walker",null);
        hm1.put("Talker",null);
        TreeMap<String,Integer>tm2=new TreeMap<>(hm1);
        System.out.println(tm1);



    }
}
