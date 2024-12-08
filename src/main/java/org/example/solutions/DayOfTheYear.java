package org.example.solutions;

/**
 * 1154. Day of the Year
 * Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.
 *
 * Example 1:
 * Input: date = "2019-01-09"
 * Output: 9
 * Explanation: Given date is the 9th day of the year in 2019.
 *
 * Example 2:
 * Input: date = "2019-02-10"
 * Output: 41
 */
public class DayOfTheYear {
    public final int [] arrDaysNotLeap = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final int [] arrDaysLeap =    {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int dayOfYear(String date) {
        String [] arrDate = date.split("-");
        int ans = 0;
        int year = Integer.valueOf(arrDate[0]);
        int month = Integer.valueOf(arrDate[1]);
        int day = Integer.valueOf(arrDate[2]);
        if (month == 1) {
            return day;
        }
        for (int i = 0; i < month - 1; i++) {
            if (isYearLeap(year)) {
                ans += arrDaysLeap[i];
            } else {
                ans += arrDaysNotLeap[i];
            }
        }
        return (ans + day);
    }
    public boolean isYearLeap (int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }
}
