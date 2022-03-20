package day14staticarraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    //Java created Arrays structure to be able to store multiple data in it.
    //You can store multiple data in an array, they should be in the same data type
    //To create an array, you must inform Java about the number of data you want to store in the array

    public static void main(String[] args) {

        int myArray[] = new int[5];

        //How to print an array on the console
        System.out.println(Arrays.toString(myArray));//[0, 0, 0, 0, 0]

        //How to assign a value to a specific array element
        myArray[1] = 11;
        System.out.println(Arrays.toString(myArray));//[0, 11, 0, 0, 0]

        myArray[3] = 21;
        System.out.println(Arrays.toString(myArray));//[0, 11, 0, 21, 0]

        myArray[4] = 1;
        System.out.println(Arrays.toString(myArray));//[0, 11, 0, 21, 1]

        myArray[0] = 41;
        myArray[2] = 31;
        System.out.println(Arrays.toString(myArray));//[41, 11, 31, 21, 1]

        //How to print a specific element on the console
        System.out.println(myArray[2]);//31

        //How to get the number of elements in an array
        //Note: We were using "length()" in String Class, we will use "length" in Arrays Class
        System.out.println(myArray.length);//5

        //Print the sum of the first and the last element in an array on the console
        int firstElement = myArray[0];
        int idxOfLastElement = myArray.length - 1;
        int lastElement = myArray[idxOfLastElement];
        System.out.println(firstElement + lastElement);//42

        //Find the sum off all elements in an array. [41, 11, 31, 21, 1]
        //1.Way:
        int sum = 0;
        for(int i=0; i<myArray.length; i++){
            sum = sum + myArray[i];
        }
        System.out.println(sum);

        //2.Way: Use while-loop
        //3.Way: Use do-while-loop

        //4.Way: Use for-each-loop. for-each-loop can be used with collections and arrays
        int sum2 = 0;
        for(int w : myArray){ // [41, 11, 31, 21, 1]
            sum2 = sum2 + w;
        }
        System.out.println(sum2);
    }
}
