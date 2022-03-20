package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement01 {

    public static void main(String[] args) {

        //Get the number of days from user and print the name of the day
        //For example; 1 ==> Sunday, 2 ==> Monday, etc.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number...");
        int dayNumber = scan.nextInt();

        //1.Way: Solve by using if-else-if statement
        if(dayNumber==1){
            System.out.println("Sunday");
        }else if(dayNumber==2){
            System.out.println("Monday");
        }else if(dayNumber==3){
            System.out.println("Tuesday");
        }else if(dayNumber==4){
            System.out.println("Wednesday");
        }else if(dayNumber==5){
            System.out.println("Thursday");
        }else if(dayNumber==6){
            System.out.println("Friday");
        }else if(dayNumber==7){
            System.out.println("Saturday");
        }else{
            System.out.println("What kind of user are you? Don't you know day numbers are from 1 to 7");
        }

        //2.Way: Solve by using switch statement
        //When to use switch? If you have more than 3 options switch is preferable

        switch(dayNumber){
            case 1:
                System.out.println("Sunday");
                break;//Go outside the switch statement
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
                break;//This is optional
        }

    }

}
