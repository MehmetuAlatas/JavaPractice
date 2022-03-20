package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    //Scanner Class is used to get data from user in Java

    public static void main(String[] args) {

        //How will we get data from user?
        //1.Step:
        Scanner scan = new Scanner(System.in);
        //2.Step:
        System.out.println("Enter your age");
        //3.Step:
        int age = scan.nextInt();
        System.out.println("The user's age is " + age);

    }

}
