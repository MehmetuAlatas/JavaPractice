package lamda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class R1 {
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
        printEven(l);
        System.out.println();
        printSquare(l);
        System.out.println();
        printCube(l);
        System.out.println();
        printMax(l);
        System.out.println();
        printMinEven(l);
        System.out.println();
        printHalfDistinct(l);
        System.out.println();
        printSumSquareDistinct(l);
        System.out.println();
        getProductCube(l);
        System.out.println();

    }

    //1)Create a method to print the list elements on the console in the same line with a space
    public static void printElement(List<Integer> list) {
        list.stream().forEach(Utils::printInSameLineWithSpace);
    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.
    public static void printEven(List<Integer> list) {
        list.stream().filter(Utils::checkToBeEven).forEach(Utils::printInSameLineWithSpace);
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a
    // space between two consecutive elements.(Functional)
    public static void printSquare(List<Integer> list) {
        list.stream().map(Utils::getSquare).filter(Utils::checkToBeOdd).forEach(Utils::printInSameLineWithSpace);
    }
    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //with a space between two consecutive elements.
    public static void printCube(List<Integer> list) {
        list.stream().map(Utils::getCube).filter(Utils::checkToBeOdd).forEach(Utils::printInSameLineWithSpace);
    }
    //5)Create a method to find the maximum value from the list elements
    public static void printMax(List<Integer> list) {
        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,Integer::max);
        System.out.println(max);
    }
    //7)Create a method to find the minimum value which is greater than 7 and even from the list
    public static void printMinEven(List<Integer> list) {
        Integer min=list.stream().distinct().filter(t->t>7).filter(Utils::checkToBeEven).reduce(Integer.MAX_VALUE,Integer::min);
        System.out.println(min);
    }
    //8)Create a method to find the half of the elements which are distinct and
    // greater than 5 in reverse order in the list.
    public static void printHalfDistinct(List<Integer> list) {
        List<Double>nlist= list.stream().distinct().filter(t->t>5).map(Utils::getHalfOfElement).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(nlist);
    }
    //9)Create a method to calculate the sum of the squares of distinct even elements
    public static void printSumSquareDistinct(List<Integer> list) {
        Integer sum= list.stream().distinct().filter(Utils::checkToBeEven).
                map(Utils::getSquare).reduce(0,Math::addExact);
        System.out.println(sum);
    }
//10)Create a method to calculate the product of the cubes of distinct even elements
    public static void getProductCube(List<Integer> list) {
      Integer product = list.stream().distinct().filter(Utils::checkToBeEven).
                map(Utils::getCube).reduce(1,Math::multiplyExact);
        System.out.println(product);

    }


}
