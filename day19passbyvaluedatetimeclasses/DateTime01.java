package day19passbyvaluedatetimeclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println(date1.getTime());// 1646187058676 ==> Returns the number of milliseconds since January 1, 1970

        System.out.println(LocalDate.now());//Returns the current date using the system clock and default time-zone, not null

        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));//2022-03-02

        //How to get future dates
        System.out.println(LocalDate.now().plusDays(200));//2022-09-17
        System.out.println(LocalDate.now().plusMonths(25));// 2024-04-01
        //How to get past dates
        System.out.println(LocalDate.now().minusWeeks(7));//2022-01-11
        System.out.println(LocalDate.now().plusYears(2).minusWeeks(5));//2024-01-26

        System.out.println(LocalTime.now());//21:35:30.458310

        System.out.println(LocalTime.now().getHour());//21
        System.out.println(LocalTime.now().getMinute());//37

        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());

        System.out.println(LocalTime.now().isAfter(LocalTime.of(22,12,35)));
        System.out.println(LocalTime.now().isBefore(LocalTime.of(22,12,35)));

        //Compare 2 birthdays. Ali:02/13/2005     Veli:03/01/2007
        System.out.println(LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01)));

        System.out.println(LocalDate.now().getDayOfWeek());//TUESDAY
        System.out.println(LocalDate.now().getMonth());//March
        System.out.println(LocalDate.now().getMonthValue());//3

        System.out.println(LocalDateTime.now());//2022-03-01T21:53:00.603413
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo")));//2022-03-01T21:54:50.551884+09:00[Asia/Tokyo]
    }
}
