package lamda_functional_programming;

import java.util.stream.IntStream;

public class R3 {
    public static void main(String[] args) {
        System.out.println(getSumFromSeven());
        System.out.println(getSumFrom1());
        System.out.println(getMultiply());
        System.out.println(getFactorial(-5));
    }
    //1)Create a method to find the sum of integers from 7 to 100 (7 and 100 inclusive)
    //1.way:
    public static int getSumFromSeven(){
        return  IntStream.range(7,101).sum();
    }
    public static int getSumFrom1(){
        return IntStream.rangeClosed(7,100).sum();
    }
    //2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static int getMultiply(){
        return IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
    }
    //3)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static Object getFactorial(int x){
        return x>0 ? IntStream.rangeClosed(1,x).reduce(1,Math::multiplyExact) : "Number must be greater than zero";
    }

}
