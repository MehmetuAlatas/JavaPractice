package day14staticarraysforeachloop;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        //How to create an array and put elements in it in one line
        int a[] = {12, 7, 0, -32};
        System.out.println(Arrays.toString(a));// [12, 7, 0, 32]

        int b[] = {7, 12, 0, 32};
        System.out.println(Arrays.toString(b));// [12, 7, 0, 32]

        //Ho wto check if two arrays are same or not
        //Note: If two arrays have same elements at the same indexes then array are same.
        boolean areArraysSame = Arrays.equals(a,b);
        System.out.println(areArraysSame);

        //Type code to check if 2 arrays have same elements
        Arrays.sort(a);//[0, 7, 12, 32]
        Arrays.sort(b);//[0, 7, 12, 32]
        if(Arrays.equals(a, b)){
            System.out.println("Same arrays");
        }else{
            System.out.println("Different arrays");
        }

        //Type code to check if a specific element exists in an array or not
        int c[] = {-12, 21, 34};
        int num = 21;
        int counter = 0;//Flag is used to test if a part of code worked or not
        for(int w : c){
            if(w==num){
                counter++;
                break;
            }
        }
        if(counter==0){
            System.out.println(num + " does not exist");
        }else {
            System.out.println(num + " exists");
        }
    }
}
