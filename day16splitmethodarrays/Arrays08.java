package day16splitmethodarrays;

import java.util.Arrays;

public class Arrays08 {

    public static void main(String[] args) {
        //Type code to find if a given element exists in the given array
        //Print the console if exists or not
        int array [] = {34,52,12,37,29};
        int expectedElement = 12;
        boolean isExist = false;
        for( int x : array){
            if(x == expectedElement){
                isExist = true;
                break;
            }
        }

        if(isExist){
            System.out.println("Exists..");
        } else {
            System.out.println("Not exists..");
        }

        //2.way:
        Arrays.sort(array);
        int idx = Arrays.binarySearch(array,expectedElement);

        if(idx >= 0){
            System.out.println("Element exists..");
        } else {
            System.out.println("Element does not exists..");
        }
    }

}
