package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement03 {

    public static void main(String[] args) {

        //Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number...");
        double firstNumber = scan.nextDouble();

        System.out.println("Enter second number...");
        double secondNumber = scan.nextDouble();

        System.out.println("Select operation +, -, *, /, %");
        //Note: To get a single character from user we type; ==> scan.next().charAt(0);
        char operation = scan.next().charAt(0);

        switch(operation){
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '%':
                System.out.println(firstNumber * secondNumber/100);
                break;
            default:
                System.out.println("Invalid operation for that calculator");
        }

        /*
            Note: In switch method parenthesis you can use just the following data types;
            a)int   b)byte c)short  d)char  d)String

            Note: In switch method parenthesis you cannot use following data types;
            a)long   b)float  c)double    d)boolean
        */
    }
}
