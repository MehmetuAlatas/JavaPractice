package day10forloopwhileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        //1.Example: Type code to print "Hello!" 5 times on the console
        //1.Way: for-loop
        for(int i=1; i<6; i++){
            System.out.println("Hello!");
        }

        System.out.println("=============");

        //2.Way:
        int i=1;
        while(i<6){
            System.out.println("Hello!");
            i++;
        }

        System.out.println("=============");

        //2.Example: Type code to print odd integers from 12 to 67 in the same line with a space between them
        int j = 12;
        while(j<68){
            if(j%2!=0){
                System.out.print(j + " ");
            }
            j++;
        }

        System.out.println("=============");

        //3.Example: Type code to find the sum of integers from 12 to 67
        int k=12;
        int sum = 0;
        while(k<15){
            sum = sum + k;
            k++;
        }
        System.out.println(sum);

        //4.Example: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scan.nextInt();
        int sumOfDigits = 0;
        while(num>0){
            sumOfDigits = sumOfDigits + num%10;
            num = num/10;
        }
        System.out.println(sumOfDigits);

	 /*
		 5.Example: Type java code by using while loop,
	     Write a program that prompts the user to input a number.
	     It should then print the multiplication table of that number.
	     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
	 */
     int n = 3;
     int m = 1;
     while(m<11){
         System.out.println(n + "x" + m + "=" + n*m);
         m++;
     }
    }
}
