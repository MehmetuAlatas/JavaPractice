package day12constructorsmethodoverloading;

public class MethodOverloading01 {

    /*
        1)If you have multiple methods whose names are same, Java looks at the parameters to select
          a specific method.
          a)To select number of parameters are important
          b)To select data types of parameters are important

        2)If you have multiple methods with the same name in a class it is called "Method Overloading"
          How can you achieve method overloading?
          i)Create methods with the same name
          ii)Use the different parameters
             a)Change the number of parameters
             b)Change the data types of the parameters
             c)If the data types are different, you can change their places
     */

    public static void main(String[] args) {
        //add(3, 5) is called "Method Call" in Java
        System.out.println(add(3, 5));
        System.out.println(add(7, 4));

        System.out.println(add(1, 4, 2));

        System.out.println(add(1.2, 2.3));

        System.out.println(add(4, 3.4));

    }
    //Create an add method which adds 2 integers
    //If you use a method inside the main method use "static" keyword between the access modifier and the "return type"
    public static int add(int a, int b){
        return a+b;
    }

    //Create an add method which adds 3 integers
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    //Create an add method which adds 2 doubles
    public static double add(double a, double b){
        return a+b;
    }

    //Create an add method which adds 1 integer and 1 double
    public static double add(int a, double b){
        return a+b;
    }

    //Create an add method which adds 1 double and 1 integer
    public static double add(double a, int b){
        return a+b;
    }

}
