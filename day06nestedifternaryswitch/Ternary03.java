package day06nestedifternaryswitch;

public class Ternary03 {

    /*
        You have 2 integers;
        If both of the integers are positive do multiplication
        If one is negative the other one is positive return "I do not how to multiply"
     */
    public static void main(String[] args) {

        int a = 12;
        int b = 5;

        //Note: If your ternary returns different data types for different scenarios, do not create reserved area for the result, put it directly inside System.out.println()
        System.out.println(a>0 && b>0 ? a*b : "I do not how to multiply");
    }
}
