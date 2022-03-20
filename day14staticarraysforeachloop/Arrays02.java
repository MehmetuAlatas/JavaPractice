package day14staticarraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Create a String array and print the elements in alphabetical order on the console in different lines
        //1.Step: Create a String array
        String myStringArray[] = new String[4]; // [ null, null, null, null ]
        System.out.println(Arrays.toString(myStringArray)); // [ null, null, null, null ]

        //Add elements into the array
        myStringArray[0] = "Veli";
        myStringArray[1] = "Can";
        myStringArray[2] = "Beyhan";
        myStringArray[3] = "Ali";
        System.out.println(Arrays.toString(myStringArray));// [Veli, Can, Beyhan, Ali]

        //How to put the elements in alphabetical order
        Arrays.sort(myStringArray);
        System.out.println(Arrays.toString(myStringArray));// [Ali, Beyhan, Can, Veli]

        //How to print the elements in different lines
        for(String w : myStringArray){
            System.out.println(w);
        }

        //Print the list elements if the number of characters is less than 4. [Ali, Beyhan, Can, Veli]
        for(String w : myStringArray){ // [Ali, Beyhan, Can, Veli]
            if(w.length()<4){
                System.out.println(w);
            }
        }

        System.out.println("=============");

        //Print the list elements before "Can"
        for(String w : myStringArray){// [Ali, Beyhan, Can, Veli]
            if(w.equals("Can")){
                break;
            }
            System.out.println(w);
        }

        System.out.println("=============");

        //Print the list elements except "Can" if there is. [Ali, Beyhan, Can, Veli]
        //1.Way:
        for(String w : myStringArray){
            if(!w.equals("Can")){
                System.out.println(w);
            }
        }

        //2.Way:
        for(String w : myStringArray){ // [Ali, Beyhan, Can, Veli]
            if(w.equals("Can")){
                continue; // Skips element/s under some conditions
            }
            System.out.println(w);
        }
    }
}