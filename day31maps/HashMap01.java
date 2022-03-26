package day31maps;

import java.util.*;

public class HashMap01 {
    /*
    1- Maps use key-value structure.
    2-"keys" must be unique, "values" can be duplicated
    3-"keys" cannot be null - except Hashmaps, in HashMaps you can use "null" once -- as a key.
    4-"values" can use null many times.
    5- HashMap does not put elements in any order because of that HashMap is super fast.
    6- If you try to send into a map repeated key, java will overwrite the value.
    7- HashMap is not thread safe and synchronized.
    ==> If you need some maps thread safe and synchronized===>HashTable is thread safe and synchronized.

    Note:Thread safety ==> Thread safe or thread safe code in Java refers to code that can safely be utilized
                            in conccurent or multi-threading envorinment, and they will behave as expected.
Java'da iş parçacığı güvenli veya iş parçacığı güvenli kodu, eşzamanlı veya çoklu iş parçacığı ortamında
 güvenle kullanılabilen ve beklendiğigibi davranacak olan kodu ifade eder.
     */
    public static void main(String[] args) {

        HashMap<Integer,String>hm1=new HashMap<>();
        hm1.put(100,"Ali");
        hm1.put(101,"veli");
        hm1.put(102,"can");
        hm1.put(103,"iea");
        hm1.put(null,"aliye");
        hm1.put(null,"kemal");
        hm1.put(104,"aliye");
        hm1.put(105,"kkmn");
        System.out.println(hm1);

        HashMap<Integer,String>hm2=new HashMap<>();

        hm2.put(87,"k");
        hm2.put(88,"l");
        hm2.put(89,"m");
        hm2.put(100,"k");//overwrite
        hm2.put(101,"l");//overwrite

        hm1.putAll(hm2);
        System.out.println(hm1);//when we add elements of a Map to another map, key and values data types should be the same

        System.out.println(hm1.size());

        hm1.putIfAbsent(102,"Z");//This means if key does not exist, create a new key value pair..
        System.out.println(hm1);

        hm1.putIfAbsent(999,"Z");//This means if key does not exist, create a new key value pair..
        System.out.println(hm1);


        System.out.println(hm1.get(5454));//null===if no exists
        System.out.println(hm1.get(101));// ıf the key exists, it will give the value af that key

        String value=hm1.getOrDefault(888,"This key is not in the map..");
        System.out.println(value);//This key is not in the map..

        String value2=hm1.getOrDefault(87,"This key is not in the map..");
        System.out.println(value2);//if you dont have a valid key, this will return our custom messages

        Set<Integer> myKeys= hm1.keySet();//This keyset() method will give us all the keys
        System.out.println(myKeys);

        Collection<String> myvalues= hm1.values();//this will return collection for all values
        System.out.println(myvalues);

// If you want to convert Map to a collection use entryset().
        Set<Map.Entry<Integer,String>>setFormMap=hm1.entrySet();
        System.out.println(setFormMap);
        for (Map.Entry<Integer,String> w: setFormMap  ){
//            System.out.println(w);
//            System.out.println(w.getKey());
//            System.out.println(w.getValue());
            System.out.println("key :"+ w.getKey()+" Value : "+ w.getValue());
        }
















    }

}
