package day06nestedifternaryswitch;

import java.util.Locale;
import java.util.Scanner;

public class SwitchStatement04 {

    public static void main(String[] args) {

        /*
            Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the country name from among America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France");
        String country = scan.next().toLowerCase();
        //Note: If you want the switch statement work with case-insensitive a)use toLowerCase() and b)make cases in switch lowercase
        switch(country){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("WE do not know the abbreviation of the given country");
                break;
        }
    }
}
