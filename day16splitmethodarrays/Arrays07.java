package day16splitmethodarrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays07 {

    public static void main(String[] args) {

        // Find the longest word in a String

        String s = "Ali Can went to school to learn";

        String array [] = s.split(" ");
        System.out.println(Arrays.toString(array)); //[Ali, Can, went, to, school, to, learn]

        Arrays.sort(array, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(array)); //[to, to, Ali, Can, went, learn, school]

        System.out.println("The longest word is: " + array[array.length-1]);
        System.out.println("The shortest word is : " + array[0]);

    }
}
