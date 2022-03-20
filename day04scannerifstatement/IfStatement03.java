package day04scannerifstatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        //Ask user to enter a day name then
        //print "Weekday" for Monday, Tuesday, Wednesday, Thursday, Friday
        //print "Weekend Day" for Saturday and Sunday

        //Note: To compare 2 Strings do not use "==" it returns wrong result mostly

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day name...");
        String dayName = scan.next();

        //Following code works, but it is not professional because there are many repetition
        if(dayName.equals("Monday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Tuesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Wednesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Thursday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Friday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Saturday")){
            System.out.println("Weekend Day");
        }
        if(dayName.equals("Sunday")){
            System.out.println("Weekend Day");
        }

        //Solve the previous task without repetition
        //Note: In Java, there is OR Operator. OR Operator sign is "||".
        //      If you use "||", when one is true the result will be true

        if(dayName.equals("Monday") || dayName.equals("Tuesday") || dayName.equals("Wednesday") || dayName.equals("Thursday") || dayName.equals("Friday")){
            System.out.println("Weekday");
        }

        if(dayName.equals("Saturday") || dayName.equals("Sunday")){
            System.out.println("Weekend Day");
        }

        //If user enters the day names in different cases like monday or mOnDaY
        //Note: Java created another method to compare 2 Strings, the method will ignore the cases.
        //      According to that method monday, MONDAY, mOnDaY will be same.
        //      THe method is equalsIgnoreCase()
        if(dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday")){
            System.out.println("Weekday");
        }

        if(dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend Day");
        }

        //Make the if statement parenthesis shorter
        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
                            dayName.equalsIgnoreCase("Tuesday") ||
                            dayName.equalsIgnoreCase("Wednesday") ||
                            dayName.equalsIgnoreCase("Thursday") ||
                            dayName.equalsIgnoreCase("Friday");
        if(isWeekDay){
            System.out.println("Weekday");
        }
        boolean isWeekEndDay = dayName.equalsIgnoreCase("Saturday") ||
                               dayName.equalsIgnoreCase("Sunday");
        if(isWeekEndDay){
            System.out.println("Weekend Day");
        }

    }

}
