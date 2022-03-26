package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
    1) HashTable is a Map
    2) HashTable is thread-safe and synchronized.
    3) HashTable does not accept "null" in keys and in values.
    4) HashTable does not put elements in any order.
    5) HashTable is slower than HashMap.
     */


    public static void main(String[] args) {

        Hashtable <String, Integer> ht1 = new Hashtable<>();
        ht1.put("Ali",300);
        ht1.put("Tom",500);
        ht1.put("Alexandra",12000);
        ht1.put("Mark",5000);
//        ht1.put("Can", null);//NullPointerException
//        ht1.put(null, 4500);//NullPointerException

        System.out.println(ht1);//{Ali=300, Mark=5000, Tom=500, Alexandra=12000}

        System.out.println(ht1.containsKey("Ali"));//true
        System.out.println(ht1.containsKey("Orcun"));//false
        System.out.println(ht1.containsValue(300));//true
        System.out.println(ht1.containsValue(5));//false

        Hashtable<String,Integer> ht2 = new Hashtable<>();
        ht2.put("Ali",300);
        ht2.put("Tom",500);
        ht2.put("Alexandra",12000);
//        ht2.put("Mark",5000);

        System.out.println(ht1.equals(ht2)); //true
        System.out.println(ht1.equals(ht2));//false

        System.out.println(ht2.isEmpty());//false

    }

}
