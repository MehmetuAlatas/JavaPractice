package day16splitmethodarrays;

import java.util.Arrays;

public class Arrays06 {

    public static void main(String[] args) {

        //Print the words ending with "y" or "Y"
        // (Make code case-insensitive)
        String t = "Learn Java, earn money.";
        t = t.replaceAll("\\p{Punct}","");

        String array [] = t.split(" ");
        System.out.println(Arrays.toString(array));

        for (String w : array){
            if(w.endsWith("y") || w.endsWith("Y")){
                System.out.println(w + " ");
            }
        }
    }
}
