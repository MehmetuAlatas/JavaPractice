package day15arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //How to check an element if it exists in an array or not
        int arr[] = {32, 14, 2, 11};
        //1.Way:
        for(int w : arr){
            if(w==14){
                System.out.println(w + " exists");
                break;
            }
        }

        //2.Way:
        // NOTE 1: binarySearch() method returns the index of existing element
        // NOTE 2: binarySearch() method returns the order number with negative sign for non-existing elements
        // NOTE 3: To use binarySearch() method you HAVE TO use sort() method otherwise the output will not be meaningful
        // NOTE 4: Do not use binarySearch() method for repeated elements, it does not give correct answer everytime
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 8));

    }
}
