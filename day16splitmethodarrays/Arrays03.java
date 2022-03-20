package day16splitmethodarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        /*
        Please split the dates and get day, month and the year separately on the console
        day : 25
        month : 02
        year : 2022
         */
        String date = "25/02/2022";
        String dateArray [] = date.split("/");
        System.out.println(Arrays.toString(dateArray));

        System.out.println("Day: " + dateArray[0]);
        System.out.println("Month: " + dateArray[1]);
        System.out.println("Year: " + dateArray[2]);

        //2.way:
        System.out.println(date.split("/")[0]); //25
        System.out.println(date.split("/")[1]); //02
        System.out.println(date.split("/")[2]); //2022
    }
}
