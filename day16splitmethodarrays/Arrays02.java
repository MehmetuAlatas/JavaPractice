package day16splitmethodarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Please split this one into its letters
        String name = "FatmaSeher"; //[F,a,t,m,a,S,e,h,e,r]
        String nameArray [] = name.split(""); //String
        System.out.println(Arrays.toString(nameArray));

        //Please split this name into a char array.
        char array [] = name.toCharArray();//char
        System.out.println("Char array => " + Arrays.toString(array));

    }
}
