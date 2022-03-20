package day15arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {

    public static void main(String[] args) {

        //Sort the array elements according to their lengths. ==> "Ali" - "Veli" - "Maria" - "Michael"
        String srr[] = {"Veli", "Michael", "Ali", "Maria"};
        System.out.println(Arrays.toString(srr));// [Veli, Michael, Ali, Maria]
        Arrays.sort(srr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(srr));// [Ali, Veli, Maria, Michael]

        //Sort the array elements in descending order according to their lengths. ==> "Michael"- "Maria" - "Veli" - "Ali"
        String trr[] = {"Veli", "Michael", "Ali", "Maria"};
        Arrays.sort(trr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(trr));// [Michael, Maria, Veli, Ali]

        //Sort the array elements in descending order according to their lengths.
        //If some elements are in the same length put them in alphabetical order==> "Michael"- "Maria" - "Ayse", "Veli" - "Ali" - "Can" - "Tan"
        String urr[] = {"Can", "Veli", "Michael", "Ali", "Maria", "Tan", "Ayse"};
        Arrays.sort(urr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        //naturalOrder() means alphabetical order in Strings, ascending order in numbers
        System.out.println(Arrays.toString(urr));
    }
}
