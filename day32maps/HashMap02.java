package day32maps;

import java.util.*;

public class HashMap02 {

    /*Create a HashMap and give key value pairs as following;
    Math = 8
    Java = 9
    SDLC = 9
    API  = 7
     */
    public static void main(String[] args) {

        HashMap<String,Integer> hm1 = new HashMap<>();
        hm1.put("Math",8);
        hm1.put("Java",9);
        hm1.put("SDLC",9);
        hm1.put("API",7);
        System.out.println(hm1);

        //How can I print keys one by one on the console?
       Set<String> keys = hm1.keySet();//keys are unique
       for(String w : keys){
           System.out.print(w + " ");
       }

        System.out.println();

       //How can I print values one by one on the console?
       Collection<Integer> values = hm1.values();
       for(Integer x : values){
           System.out.print(x + " ");
       }

        System.out.println();

        System.out.println(hm1);//{Java=9, API=7, Math=8, SDLC=9}
        Set<  Map.Entry<String,Integer>  > setForm =  hm1.entrySet();
        System.out.println(setForm);//[Java=9, API=7, Math=8, SDLC=9]

        for( Map.Entry<String,Integer>  w : setForm){
            System.out.println(w);
        }


        //How can I see the course names with grades greater than 8 on the console?
        for (Map.Entry<String,Integer>  w : setForm){
            if(w.getValue() > 8 ){
                System.out.println("The courses with grades greater than 8 ==> " + w.getKey());
            }
        }



        //When we use maps, we can print them on the console as a map.
        System.out.println(hm1);//{Java=9, API=7, Math=8, SDLC=9}

        //When we maps, we can print them on the console as a set.
        System.out.println(hm1.entrySet());//[Java=9, API=7, Math=8, SDLC=9]

        //When we use maps, we can use "keySet()" method to print all keys on the console
        System.out.println("All keys: " + hm1.keySet());//All keys: [Java, API, Math, SDLC]

        //When we use maps, we can use "values()" method to print all values on the console
        System.out.println("All values: " + hm1.values()) ;//All values: [9, 7, 8, 9]

        //When we get a specific value from map, we can use "get()"
        System.out.println("Math result is: " + hm1.get("Math"));//Math result is: 8
//                                                        key   ==>               value


        //How can I replace elements?
//                                "SDLC",9
        Integer oldestValue = hm1.replace("SDLC",10);  //replace method with 2 parameters returns me old value of given key
        System.out.println("Old value of SDLC: " + oldestValue);//Old value of SDLC: 9
        System.out.println(hm1);//{Java=9, API=7, Math=8, SDLC=10}

        Integer oldValue = hm1.replace("SDLC", 5);//Old value: 10
        System.out.println("Old value: " + oldValue);


        //This method will take key and value, it will check 2 conditions.
        //If 2 conditions are true, it will change the value of that key.
        boolean isTrue = hm1.replace("API",7,10);//returns boolean
        System.out.println(isTrue);
        System.out.println(hm1);

        //How to remove element from map?
        Integer removedValue = hm1.remove("SDLC");
        System.out.println(removedValue); //5
        System.out.println(hm1);//{Java=9, API=10, Math=8}

        //I can remove entries(elements) from a map based on key value pairs.
        boolean isCorrect = hm1.remove("Math",8);
        System.out.println(isCorrect);//true
        System.out.println(hm1);//{Java=9, API=10}

        boolean isRight = hm1.remove("API",12);
        System.out.println(isRight);//false
        System.out.println(hm1);//{Java=9, API=10}

            /*
    HashMap accepts one null key and null values ==>T

    HashMap is not thread-safe ==> T

    HashMap is slower than HashTable ==> F

    HashTable must have values in natural order ==> F

    HashTable is thread-safe ==> T

    HashTable can accept null key and value ==> F

    HashTable is faster than TreeMap ==>T

    TreeMap is not thread-safe ==> T

    TreeMap accepts null key ==> F

    TreeMap allows null values ==> T
     */

    }
}
