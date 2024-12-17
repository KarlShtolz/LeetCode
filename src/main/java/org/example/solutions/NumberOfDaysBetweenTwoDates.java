package org.example.solutions;
import static java.time.LocalDate.parse;
import static java.time.temporal.ChronoUnit.DAYS;
/**
 * 1360. Number of Days Between Two Dates
 * Write a program to count the number of days between two dates.
 * The two dates are given as strings, their format is YYYY-MM-DD as shown in the examples.
 *
 * Example 1:
 * Input: date1 = "2019-06-29", date2 = "2019-06-30"
 * Output: 1
 *
 * Example 2:
 * Input: date1 = "2020-01-15", date2 = "2019-12-31"
 * Output: 15
 */
public class NumberOfDaysBetweenTwoDates {
    public int daysBetweenDates(String date1, String date2) {
        return (int) Math.abs(DAYS.between(parse(date1), parse(date2)));
    }
}
