package day02datatypes;

public class DataTypes02 {

    public static void main(String[] args) {

        //Create a char variable and print it on the console
        //Every character has an integer value in IT area. Those values are called ASCII Values
        //Note: If you use any char in a mathematical operation, Java uses its ASCII Value in the operation
        char c = 'A';
        System.out.println(c);//A
        System.out.println(c + 1);//66

        //Type code to find the ASCII Value of "!"
        char e = '!';
        System.out.println(e + 0);//33

        //Type code to find the sum of the ASCII Values of 'X' and 'y' and '?'
        char c1 = 'X', c2 = 'y', c3 = '?';
        System.out.println(c1 + c2 + c3);//272

        //Create 2 integer variables whose values are 5 and 2 then print the result of first is divided by second
        //If you use just "int" data type in mathematical operations the result will be in "int" data type.
        //In the result, Java will remove decimal part and return just the whole part
        int i = 8, k = 3;
        System.out.println(i/k);//2

        /*
            When you use different data types in mathematical operations
            the result will be in the largest data type.
            Because of that the result data type will be double
         */
        double m = 5;
        int n = 2;
        System.out.println(m/n);//2.5

        //In how many ways you can fix the following issue?
        //1.Way:
        float z = 2.5F;

        //2.Way:
        double r = 2.5;

        //What is the output of the followings?
        System.out.println(2 + 3 + "Ali");

        System.out.println(2 + 'a' + "B" + (3 + 4));//99B7
    }
}
