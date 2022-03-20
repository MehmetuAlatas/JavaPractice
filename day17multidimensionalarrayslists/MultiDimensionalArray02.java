package day17multidimensionalarrayslists;

import java.util.Arrays;

public class MultiDimensionalArray02 {

    public static void main(String[] args) {

        String arr1[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        //Print the elements which have "a" from a 2 dimensional String array. { {"learn", "java", "it"}, {"is", "easy"} }
        for(String[] w : arr1){
            for(String m : w){
                if(m.contains("a")){
                    System.out.print(m + " ");
                }
            }
        }

        //Convert arr1 to one dimensional array. { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }

        //Find the total number of elements in arr1
        int sum = 0;
        for(String[] w : arr1){
            sum = sum + w.length;
        }
        //Create a one-dimensional array whose length equals to the total number of elements in arr1
        String newArr[] = new String[sum]; // {null, null, null, null, null}

        //Transfer elements from arr1 to newArr
        int idx = 0;
        for(String[] w : arr1){ // { {"learn", "java", "it"}, {"is", "easy"} }
            for(String m : w){
                newArr[idx] = m; //{null, null, null, null, null}
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

}
