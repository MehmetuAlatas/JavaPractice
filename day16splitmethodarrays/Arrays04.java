package day16splitmethodarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {

        //1)Get string from user and type code to find the number of words in a String.
        //2)Count how many words starts with "a".(Make code case-sensitive)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String..");
        String str = scan.nextLine();

        String array [] = str.split(" ");
        System.out.println(Arrays.toString(array));
        System.out.println("The number of words in the given string is: " + array.length);

        int counter = 0;
        for(String w : array){
            if(w.startsWith("a")){
                counter++;
            }
        }

        System.out.println("The number of words which starts with 'a' is : " + counter);

    }
}
