package day07stringmanipulations;

public class Sm02 {

    public static void main(String[] args) {

        String str = "Ali Can";

        String newStr = str.concat("!...").concat("Wow");// You can do concatenation by "+" sign but using concat() is better
        System.out.println(newStr);

        boolean isLast = str.endsWith("Can");
        System.out.println(isLast);

        boolean isFirst = str.startsWith("M");
        System.out.println(isFirst);

        //str.startsWith("C", 4) means skip first 4 characters then check if the remaining String is starting wit "C"
        boolean isTheForth = str.startsWith("C", 4);
        System.out.println(isTheForth);//true

         /*
            11)concat()
            12)endsWith()
            13)startsWith(With 1 parameter)
            14)startsWith(With 2 parameters)
         */
    }
}
