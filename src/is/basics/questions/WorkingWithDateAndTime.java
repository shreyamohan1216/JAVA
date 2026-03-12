package is.basics.questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date:" + date);
        LocalTime time =LocalTime.now();
        System.out.println("Time:" + time);
        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println("Date&Time:"+ dateTime);
        /*Display  the day of the month
        *Display the day of the year
        * Display the Week Name,Month Name,Month Number
         */
        DateTimeFormatter format=DateTimeFormatter.ofPattern("E, MMM dd yyyy");//D,E,MMM,M,dd
        String formattedDateTime= dateTime.format(format);
        System.out.println("Formatted Date:"+formattedDateTime);
    }
}
/*
E-Name of the day:(Mon-Sun)
D-Day of the year(1-366)(Including LeapYear)
dd-Day of the Month(1-31)
M-Month Number(1-12)
MMM-Month Name(Jan-Dec)
 */