package day17multidimensionalarrayslists;

public class MultiDimensionalArray03 {

    public static void main(String[] args) {

        //Find the maximum element in 2 dimensional array
        int a[][] = { {5, 0}, {-5, 34}, {65, 22, 31} };
        int x = Integer.MIN_VALUE;
        for(int[] w : a){ //{ {5, 0}, {-5, 34}, {65, 22, 31} }
            for(int m: w){
                if(x<m){
                    x=m;
                }
            }
        }
        System.out.println(x);
    }
}
