package lamda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class R2 {
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
        printElement(l);
        System.out.println();
        //printInUpperCase02(l);
        System.out.println(l);
        printElementLength(l);
        System.out.println();
        printReverseLength(l);
        System.out.println();
        printLastDistinct(l);
        System.out.println();
        printLengthsFirstchar(l);
        System.out.println();
    //    removeLengths(l);
        System.out.println(checkLengthsElement(l));



    }

    //1) Create a method to print all list elements in uppercase in the same line with a space
    public static void printElement(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::printInSameLineWithSpace);
    }

    //2)Create a method to print the list elements in uppercase in the same line with a space
//    public static void printInUpperCase02(List<String> list){
//        list.replaceAll(String::toUpperCase);//Mutable
//        System.out.println(list);
//    }
    //Create a method to print the elements after ordering according to their lengths.
    public static void printElementLength(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInSameLineWithSpace);
    }

    //3) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printReverseLength(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInSameLineWithSpace);
    }

    //4) Create a method to sort the distinct elements by using their last characters
    public static void printLastDistinct(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).
                forEach(Utils::printInSameLineWithSpace);
    }

    //5) Create a method to sort the elements according to their lengths then according to their first character
    public static void printLengthsFirstchar(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).
                forEach(Utils::printInSameLineWithSpace);
    }

    //    6) Remove the elements if the length of the element is greater than 5
//    public static void removeTheElementWhoseLengthGreaterThanFive(List<String> list){
//       list.removeIf(t->t.length() > 5);
//        System.out.println(list);
//    }

    //Remove the elements if the length is between 8 and 10 or ending with 'o' (8 and 10 inclusive)
//    public static void removeLengths(List<String> list) {
//       // list.removeIf(t->t.length()>3&&t.length()<11||t.endsWith("o"));
//        Predicate<String > check=t->t.length()>3&&t.length()<11||t.endsWith("o");
//        list.removeIf(t->check.test(t));
//        System.out.println(list);
//
//    }
    //Create a method to check if the lengths of all elements are less than 12

    public static boolean checkLengthsElement(List<String> list) {
    return list.stream().allMatch(t->t.length()<12);

    }
    //Create a method to check if the initial of any element is not 'X'
    public static boolean checkNotToStartWithX(List<String> list){
        return list.stream().noneMatch(t->t.startsWith("X"));
    }
    //Create a method to check if at least one of the elements ending with “r”
    public static boolean checkAtLeastAnyMatch(List<String> list){
        return list.stream().anyMatch(t->t.endsWith("r"));
    }


}
