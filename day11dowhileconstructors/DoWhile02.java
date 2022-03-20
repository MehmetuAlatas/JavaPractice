package day11dowhileconstructors;

import java.util.Scanner;

public class DoWhile02 {

    	/*
	 	  Ask user to enter an integer.
		  If the integer is less than 100, tell user "Won!"
		  Otherwise, tell user "Lost!"
	    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        do{
            System.out.println("Enter an integer...");
            n = scan.nextInt();
            if(n<100){
                System.out.println("Won!");
            }
        }while(n<100);

        System.out.println("Lost!");
    }
}
