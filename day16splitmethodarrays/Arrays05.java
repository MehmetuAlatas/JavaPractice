package day16splitmethodarrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Find the vowels in a String by using arrays.
        // Print them on the console
        // a e i o u
        String s = " Learn java, earn money.";
        String array [] = s.split("");
        System.out.println(Arrays.toString(array));

        int counter = 0;
        for (String w : array){
            if(w.equalsIgnoreCase("a") || w.equalsIgnoreCase("e") ||
                    w.equalsIgnoreCase("i") || w.equalsIgnoreCase("o") ||
                    w.equalsIgnoreCase("u")){
                System.out.print(w + " ");
                counter++;
            }
        }

        System.out.println();
        System.out.println("The number of vowels is : " + counter);

    }
}
