package lamda_functional_programming;

import java.util.List;

public class Utils {
    public static void printInSameLineWithSpace(Object o){
        System.out.print(o + " ");
    }

    public static void printElementsWithStar(Object o){
        System.out.println(o + "*");
    }

    public static boolean checkToBeEven(int x){
        return x % 2 ==0;
    }

    public static boolean checkToBeOdd(int x){
        return x % 2 != 0;
    }

    public static int getSquare(int x){
        return x*x;
    }

    public static int getCube(int x){
        return x*x*x;
    }

    public static double getHalfOfElement(int x){
        return x / 2.0;
    }

    public static char getLastChar(String str){
        return str.charAt(str.length()-1);
    }


}