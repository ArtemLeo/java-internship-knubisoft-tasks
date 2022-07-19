package com.knubisoft.base.date;

public interface DateTasks {

    /**
     * Given an input string containing random date in [year-month-day] format, your task is to parse the input string
     * to the object for working with date and time, add 1 day, and return the modified date in string format.
     *
     * Example:
     *
     *     input "2000-03-15"
     *     output: "2000-03-16"
     *
     * @param date Random date in string format.
     * @return Modified date in string format.
     */
    String add1Day(String date);

    /**
     * Given an input string containing random date in [day of week, date month year] format, your task is to parse the input
     * string to the object for working with date and time, and return number of month.
     *
     * Example:
     *
     *     input: Mon, 26 Nov 2018
     *     output: 11
     *
     * @param date Random date in string format.
     * @return Number of month.
     */
    int getMonthFromDate(String date);

    /**
     * Given 3 input strings containing different random dates in the format [year-month-day hours:minutes:seconds],
     * your task is to parse these strings to the objects for working with date and time, compare 3 dates and
     * return the largest of them in string format.
     *
     * Example:
     *
     *     input: date1 - "2015-01-22 10:15:55", date2 - "2022-05-17 18:42:51", date3 - "2022-02-19 18:42:51"
     *     output: "2022-05-17 18:42:51"
     *
     * @param date1 First random date in string format.
     * @param date2 Second random  date in string format.
     * @param date3 Third random date in string format.
     * @return Biggest date.
     */
    String findBiggestDate(String date1, String date2, String date3);

    /**
     * Given an input string containing random date in [year-month-day] format, your task is to parse the input
     * string to the object for working with date and time, and return the last day of the month in same string format
     * as input string.
     *
     * Example:
     *
     *     input: 2000-03-15
     *     output: 2000-03-31
     *
     * @param date Random date in string format
     * @return The last day of the month.
     */
    String getLastDayOfTheMonth(String date);

    /**
     * Given 2 input strings containing different random times in the format [hours:minutes:seconds], your task is to parse
     * these strings to the objects for working with date and time, sum 2 times and return result in same string format
     * as input strings.
     *
     * Example 1:
     *
     *     input: time1 - "11:30:00", time2 - "02:35:00"
     *     output: "14:05:00"
     *
     * Example 2:
     *
     *     input: time1 - "23:59:59", time2 - "00:00:01"
     *     output: 00:00:00
     *
     * @param time1 First random time in string format.
     * @param time2 Second random time in string format.
     * @return Sum result.
     */
    String sumTimes(String time1, String time2);

    /**
     * Given an input string containing random date in [year-month-day] format, your task is to parse the input string
     * to the object for working with date and time, and return the date after 2 weeks based on the input string.
     *
     * Example:
     *
     *     input: "2012-01-21"
     *     output: "2012-02-04"
     *
     * @param date Random date in string format.
     * @return Date after 2 weeks.
     */
    String getDateAfter2Weeks(String date);

    /**
     * Given 2 input strings containing different random dates in the format [year-month-day], your task is to parse
     * these strings to the objects for working with date and time, and return number of days between these dates.
     *
     * Example 1:
     *
     *     input: date1 - "2012-09-21", date2 - "2022-09-21"
     *     output: 3652
     *
     * Example 2:
     *
     *     input: date1 - "2020-09-21", date2 - "2020-09-21"
     *     output: 0
     *
     * Example 3:
     *
     *     input: date1 - "2021-11-23", date2 - "2021-12-31"
     *     output: 38
     *
     * @param date1 First random date in string format.
     * @param date2 Second random date in string format.
     * @return
     */
    long getNumberOfDaysBetweenTwoDates(String date1, String date2);

    /**
     * Given an input string containing random date in [year-month-day] format, your task is to parse the input string
     * to the object for working with date and time, and return array that contains previous and next friday based on input date.
     *
     * Note: the array should only contain 2 elements,
     *       array[0] -> previous friday
     *       array[1] -> next friday
     *
     * Example 1:
     *
     *     input: "2021-07-27"
     *     output: ["2021-07-23", "2021-07-30"]
     *
     * Example 2:
     *
     *     input: "2015-11-13"
     *     output: ["2015-11-06", "2015-11-20"]
     *
     * Example 3:
     *
     *     input: "2017-11-01"
     *     output: ["2017-10-27", "2017-11-03"]
     *
     * @param date Random date in string format.
     * @return Array that contain previous and next friday dates based on input random date.
     */
    String[] getTheNextAndPreviousFriday(String date);

    /**
     * Given an input string containing random date in [year-month-day] format, your task is to parse the input string
     * to the object for working with date and time, and return number of months remaining in the year.
     *
     * Example 1:
     *
     *     input: "2012-01-22"
     *     output: 11
     *
     * Example 2:
     *
     *     input: "2020-12-30"
     *     output: 0
     *
     * @param date Random date in string format.
     * @return Number of months remaining in the year.
     */
    int getNumberOfMonthsRemainingInTheYear(String date);
}
