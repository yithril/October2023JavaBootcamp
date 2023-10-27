package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    /*
        y: Year (e.g., "yy" for two-digit year or "yyyy" for four-digit year)
    M: Month (e.g., "M" for numeric, "MM" for zero-padded, "MMM" for abbreviated name, "MMMM" for full name)
    d: Day of the month (e.g., "d" for numeric, "dd" for zero-padded)
    H: Hour of the day (0-23)
    h: Hour of the day (1-12 for AM/PM format)
    m: Minute of the hour
    s: Second of the minute
    S: Fraction of a second
    E: Day of the week (e.g., "E" for abbreviated name, "EEEE" for full name)
    a: AM/PM marker
    z: Time zone abbreviation
     */
    public static void main(String[] args) {
        String dateToParse = "23/03/1999";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate formattedDate = LocalDate.parse(dateToParse, dtf);

        System.out.println(formattedDate);

        LocalDate firstDate = LocalDate.of(2023, 10, 1);
        LocalDate secondDate = LocalDate.of(2023, 5, 23);

        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);

        System.out.println(daysBetween);
    }
}