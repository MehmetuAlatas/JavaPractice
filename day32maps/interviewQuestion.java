package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class interviewQuestion {

        /*
                How to count the number of occurrences of the words in a sentence
                For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
                              Java=3, is=1, easy=1, Type=1, ... , learn=2, ... ==> I can understand I can create a map
         */

    public static void main(String[] args) {

        String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
        String words[] = str.replaceAll("\\p{Punct}", "").split(" ");
        System.out.println(Arrays.toString(words));//[Java, is, easy, Type, codes, to, learn, Java, To, earn, money, learn, Java]

        HashMap<String, Integer> result = new HashMap<>();

        for (String w : words) {
            Integer numOfOccurrence = result.get(w);
            if (numOfOccurrence == null) {
                //If the word does not exist in the map, this part will be executed
                result.put(w, 1);
            } else {
                //If the word exists in the map, else body will be executed
                result.put(w, numOfOccurrence + 1);//{Java=3, codes=1, Type=1, money=1, learn=2, earn=1, is=1, to=1, To=1, easy=1}
            }
        }
        System.out.println(result);

    }

}