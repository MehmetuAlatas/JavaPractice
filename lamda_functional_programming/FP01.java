package lamda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP01 {
    /*
        Lamda is functional programming, we had lamda in java with version 8.
        Functional programming focuses on "what to do", with structured programming we focus "how to do"
        Functional programming is used with Collections, Arrays..
        We can not use functional programming with maps, but we can convert Maps to Collection by using entrySet()method and we can use functional programming
     */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);
        printElementsStructured(l);
        System.out.println();
        printElementsFunctional(l);
        System.out.println();
        printEvenElementStructured(l);
        System.out.println();
        printEvenElementFunctional(l);
        System.out.println();
        printSquareOdd(l);
        System.out.println();
        printCubeDistinctOdd(l);
        System.out.println();
        findMaxValue01(l);
        findMaxValue02(l);
        getMinEvenMore7(l);
        getMinEvenMore702(l);
        getMinEvenMore703(l);
        getHalfGreater5(l);
        sumOfSquaresDistEven(l);
    }

    //1)Create a method to print the list elements on the console in the same line with a space between consecutive elements(Structured)
    public static void printElementsStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    //1)Create a method to print the list elements on the console in the same line with a space between consecutive elements(Functional)
    public static void printElementsFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }

    //2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)
    public static void printEvenElementStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Functional)
    public static void printEvenElementFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.(Functional)
    public static void printSquareOdd(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements.
    public static void printCubeDistinctOdd(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //5)Create a method to find the maximum value from the list elements
    //1 Way:
    public static void findMaxValue01(List<Integer> list) {
        Integer maxvalue = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(maxvalue);
    }

    //2.Way:
    public static void findMaxValue02(List<Integer> list) {
        Integer maxvalue02 = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println(maxvalue02);
    }
//6)Homework: Create a method to find the minimum value from the list elements(In 2 ways)

    //7)Create a method to find the minimum value which is greater than 7 and even from the list more than 7, even, min value
    //1. way
    public static void getMinEvenMore7(List<Integer> list) {
        Integer minvalue = list.stream().
                distinct().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println(minvalue);
    }

    //2. way
    public static void getMinEvenMore702(List<Integer> list) {
        Integer minvalue = list.stream().
                distinct().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(minvalue);
    }

    //3. way
    public static void getMinEvenMore703(List<Integer> list) {
        Integer minvaluee = list.stream().
                distinct().
                filter(t -> t > 7).
                filter(t -> t % 2 == 0).
                sorted().
                findFirst().
                get();
        System.out.println(minvaluee);
    }

    //8)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
    public static void getHalfGreater5(List<Integer> list) {
        List<Double> list1= list.stream().distinct().filter(t -> t > 5).sorted(Comparator.reverseOrder()).map(t -> t / 2.0).collect(Collectors.toList());
        System.out.println(list1);
    }
    //9)Create a method to calculate the sum of the squares of distinct even elements

    public static void sumOfSquaresDistEven(List<Integer> list){
      Integer value=  list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t + u);
        System.out.println(value);
    }
//10)Create a method to calculate the product of the cubes of distinct even elements
    public static void productCubesEven(List<Integer> list){
       Integer product= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(0,(t,u)->t * u);
        System.out.println(product);
    }

}

