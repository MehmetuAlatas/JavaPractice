package day06nestedifternaryswitch;

public class Ternary01 {

    public static void main(String[] args) {

        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"

        //1.Way: Solve by using if-else statement
        int num = 10;
        if(num>0){
            System.out.println("The integer is positive");
        }else{
            System.out.println("The integer is not positive");
        }

        //2.Way: Ternary

                     //Condition   Question Mark   Result for happy scenario    Colon   Result for negative scenario
        String result = num>0           ?          "The integer is positive"      :     "The integer is not positive";
        System.out.println(result);

        //Write a program to print the minimum of 2 integers on the console. Use ternary...
        int a = 100;
        int b = 100;
        int min = a<b ? a : b;
        System.out.println(min);

    }

}
