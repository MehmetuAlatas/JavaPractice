package day19passbyvaluedatetimeclasses;

public class PassByValue {

    /*
        1)When you use a variable inside a method, Java creates a copy of the variable and use the copy inside the method.
          Because Java wants to protect original value of the variable. This process is called "Pass by Value" in Java.
        2)Java uses "Pass by Value" everytime.
        3)The opposite of "Pass by Value" is "Pass by Reference", Java does not use "Pass by Reference"
          THe programming languages use pass by reference does not protect the original value.
     */

    public static void main(String[] args) {

        int shirt = 100;

        int veteranShirt = veteransDiscount(shirt);
        System.out.println(veteranShirt);//80

        int seniorShirt = seniorsDiscount(shirt);
        System.out.println(seniorShirt);//90

        System.out.println(shirt);//100

    }

    //main method is static, everything you used in main method must be static
    public static int veteransDiscount(int shirt){
        return shirt-20;
    }

    public static int seniorsDiscount(int shirt){
        return shirt-10;
    }

    public static int studentDiscount(int shirt){
        return shirt-5;
    }
}
