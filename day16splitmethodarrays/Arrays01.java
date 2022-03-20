package day16splitmethodarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        //Put each word to an array as an element
        String words = "I go to school";
        String array [] = words.split(" ");
        System.out.println(Arrays.toString(array));

        String name = "Sevval#Mustafa#Suat#Fatmanur";
        String nameArray [] = name.split("#");
        System.out.println(Arrays.toString(nameArray));

        String sentence = "Learn Java earn money";
        String arrSentence [] = sentence.split(" ");
        System.out.println(Arrays.toString(arrSentence));

        //I go to school and I talk to friends and I talk to teachers
        //Please separate each sentence from "and" put them in an array.
        String sent = "I go to school and I talk to friends and I talk to teachers";
        String arr [] = sent.split("and");
        System.out.println(Arrays.toString(arr));
    }
}
