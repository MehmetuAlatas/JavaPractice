package lamda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Review {
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
        printElement(l);
        System.out.println();
        printEvenElement(l);
        System.out.println();
        printSquareOdd(l);
        System.out.println();
        getCubeDistinctOdd(l);
        System.out.println();
        getMax(l);
        getMax2(l);
        getMax(l);
        getMin(l);
        getMin2(l);
        getMinGreater7even(l);
        getMinGreater7even2(l);
        getMinGreater7even3(l);
        getHalfDistinctGreater(l);

    }
    //1)Create a method to print the list elements on the console in the same line with a space between consecutive elements(Functional)

    public static void printElement(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }

    //2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Functional)
    public static void printEvenElement(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }
    //3)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.(Functional)

    public static void printSquareOdd(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        //  list.stream().filter(t->t%2!=0).forEach(t-> System.out.print(t*t+" "));
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements.
    public static void getCubeDistinctOdd(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 == 1).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //5)Create a method to find the maximum value from the list elements ==> stream, distinct,
    public static void getMax(List<Integer> list) {
        //1. Way
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    public static void getMax2(List<Integer> list) {
        //2. Way
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println(max);
    }

    public static void getMax3(List<Integer> list) {
        //3. Way
        Integer max = list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(max);
    }

    //6)Homework: Create a method to find the minimum value from the list elements(In 2 ways)
    public static void getMin(List<Integer> list) {
        Integer min = list.stream().distinct().sorted().findFirst().get();
        System.out.println(min);

    }

    //2. Way
    public static void getMin2(List<Integer> list) {
        Integer min = list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(min);
    }

    //7)Create a method to find the minimum value which is greater than 7 and even from the list more than 7, even, min value
    public static void getMinGreater7even(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t > 7).filter(t -> t % 2 == 0).reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println(min);
    }
    //2.way
    public static void getMinGreater7even2(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t > 7).filter(t -> t % 2 == 0).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(min);
    }
    //3.way
    public static void getMinGreater7even3(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t > 7).filter(t -> t % 2 == 0).sorted().findFirst().get();
        System.out.println(min);
    }
    //8)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
    public static void getHalfDistinctGreater(List<Integer> list){
        List<Double>doubleList= list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(doubleList);
    }

}
