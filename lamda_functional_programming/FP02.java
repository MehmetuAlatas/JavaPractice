package lamda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class FP02 {
/*
    In functional programming we can use "Lambda expressions" it is allowed, but it is not recommended
    Instead of "Lambda expressions", we prefer to use "Method reference"
    When we use method reference we have " Class name :: method name "  Be careful about () -> we do not need
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
        printElements01(l);
        System.out.println();
        printElements02(l);
        printElements03(l);

    }

    //Create a method to print the list elements on the console one by one
    public static void printElements01(List<Integer> list) {
        list.stream().forEach(System.out::print);
    }

    //Create a method to print the list elements on the console in the same line with a space
    //between two consecutive elements.
    public static void printElements02(List<Integer> list) {
        list.stream().forEach(Utils::printInSameLineWithSpace);
//                        Class name :: method name
    }

    //Create a method to print all elements on a separate line with a star
    public static void printElements03(List<Integer> list) {
        list.stream().forEach(Utils::printElementsWithStar);
    }
}