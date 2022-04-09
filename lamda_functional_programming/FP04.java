package lamda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FP04 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

        printInUpperCase01(l);//ALI ALI MARK AMANDA CHRISTOPHER JACKSON MARIANO ALBERTO TUCKER BENJAMIN
        System.out.println();
//        printInUpperCase02(l);//[ALI, ALI, MARK, AMANDA, CHRISTOPHER, JACKSON, MARIANO, ALBERTO, TUCKER, BENJAMIN]
        System.out.println(l);
        printTheElementsOrderedBasedOnLength(l);
        System.out.println();
        printTheElementsOrderedBasedOnLength02(l);
        System.out.println();
        //    printDistinctElementsSortedByLastChar(l);
        pritnElementAccordingToTheLengt(l);
        System.out.println();
        removeElementAccordingToTheLengt(l);

    }

    //1) Create a method to print all list elements in uppercase in the same line with a space
    //1.way:
    public static void printInUpperCase01(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::printInSameLineWithSpace);
    }
    //2)Create a method to print the list elements in uppercase in the same line with a space
//    public static void printInUpperCase02(List<String> list){
//        list.replaceAll(String::toUpperCase);//Mutable
//        System.out.println(list);
//    }

    //Create a method to print the elements after ordering according to their lengths.
    public static void printTheElementsOrderedBasedOnLength(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInSameLineWithSpace);
    }

    //3) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printTheElementsOrderedBasedOnLength02(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInSameLineWithSpace);
    }

//    //4) Create a method to sort the distinct elements by using their last characters
//    public static void printDistinctElementsSortedByLastChar(List<String> list){
//        list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::printInSameLineWithSpace);
//    }
//5) Create a method to sort the elements according to their lengths then according to their first character

    public static void pritnElementAccordingToTheLengt(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).
                forEach((Utils::printInSameLineWithSpace));

    }

    public static void removeElementAccordingToTheLengt(List<String> list) {
        list.removeIf(t -> t.length() > 7 && t.length() <= 10 || t.endsWith("o"));
        System.out.println(list);

    }


}