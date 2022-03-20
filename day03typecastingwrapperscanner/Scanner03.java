package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the price of shirt");

        double priceOfShirt = scan.nextDouble();

        System.out.println("The price is " + priceOfShirt);
    }
}
