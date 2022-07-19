package com.knubisoft.base.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTasksTest {

    DateTasks dateTasks = new DateTasksImpl();

    @Test
    void add1Day() {
        assertEquals("2022-01-28",dateTasks.add1Day("2022-01-27"));
        assertEquals("1993-01-01",dateTasks.add1Day("1992-12-31"));
        assertEquals("2012-02-29",dateTasks.add1Day("2012-02-28"));
        assertEquals("1949-03-16",dateTasks.add1Day("1949-03-15"));
        assertEquals("2020-07-31",dateTasks.add1Day("2020-07-30"));
        assertEquals("2000-03-16",dateTasks.add1Day("2000-03-15"));
    }

    @Test
    void getMonthFromDate() {
        assertEquals(11, dateTasks.getMonthFromDate("Mon, 26 Nov 2018"));
        assertEquals(5, dateTasks.getMonthFromDate("Tue, 06 May 1980"));
        assertEquals(1, dateTasks.getMonthFromDate("Wed, 03 Jan 2018"));
        assertEquals(8, dateTasks.getMonthFromDate("Thu, 01 Aug 2019"));
        assertEquals(3, dateTasks.getMonthFromDate("Fri, 17 Mar 1978"));
        assertEquals(12, dateTasks.getMonthFromDate("Sat, 31 Dec 1977"));
        assertEquals(10, dateTasks.getMonthFromDate("Sun, 02 Oct 1977"));
    }

    @Test
    void findBiggestDate() {
        assertEquals("2022-05-17 18:42:51",
                dateTasks.findBiggestDate("2015-01-22 10:15:55", "2022-05-17 18:42:51", "2022-02-19 18:42:51"));
        assertEquals("2022-05-17 18:42:53",
                dateTasks.findBiggestDate("2022-05-17 18:42:51", "2022-05-17 18:42:52", "2022-05-17 18:42:53"));
        assertEquals("2017-08-23 15:42:21",
                dateTasks.findBiggestDate("2012-12-31 10:30:59", "2017-08-23 15:42:21", "1981-04-13 09:12:17"));
        assertEquals("1950-01-01 01:01:01",
                dateTasks.findBiggestDate("1950-01-01 01:01:01", "1950-01-01 01:01:01", "1950-01-01 01:01:01"));
        assertEquals("1999-07-10 23:59:59",
                dateTasks.findBiggestDate("1999-06-10 23:59:59", "1988-06-11 23:43:11", "1999-07-10 23:59:59"));
        assertEquals("2020-07-23 01:17:41",
                dateTasks.findBiggestDate("2015-01-22 10:15:55", "2020-07-23 01:17:41", "2001-11-29 19:45:50"));
    }

    @Test
    void getLastDayOfTheMonth() {
        assertEquals("2000-03-31", dateTasks.getLastDayOfTheMonth("2000-03-15"));
        assertEquals("2020-02-29", dateTasks.getLastDayOfTheMonth("2020-02-07"));
        assertEquals("1920-11-30", dateTasks.getLastDayOfTheMonth("1920-11-29"));
        assertEquals("2012-08-31", dateTasks.getLastDayOfTheMonth("2012-08-05"));
        assertEquals("2005-02-28", dateTasks.getLastDayOfTheMonth("2005-02-01"));
    }

    @Test
    void sumTimes() {
        assertEquals("10:30:00", dateTasks.sumTimes("07:00:00", "03:30:00"));
        assertEquals("00:00:00", dateTasks.sumTimes("23:59:59", "00:00:01"));
        assertEquals("12:56:57", dateTasks.sumTimes("10:55:45", "02:01:12"));
        assertEquals("03:45:01", dateTasks.sumTimes("23:55:40", "03:49:21"));
        assertEquals("16:27:41", dateTasks.sumTimes("10:12:30", "06:15:11"));
    }

    @Test
    void getDateAfter2Weeks() {
        assertEquals("2012-02-04", dateTasks.getDateAfter2Weeks("2012-01-21"));
        assertEquals("2020-03-13", dateTasks.getDateAfter2Weeks("2020-02-28"));
        assertEquals("1922-10-01", dateTasks.getDateAfter2Weeks("1922-09-17"));
        assertEquals("1919-07-15", dateTasks.getDateAfter2Weeks("1919-07-01"));
        assertEquals("2022-01-03", dateTasks.getDateAfter2Weeks("2021-12-20"));
        assertEquals("2017-05-21", dateTasks.getDateAfter2Weeks("2017-05-07"));
    }

    @Test
    void getNumberOfDaysBetweenTwoDates() {
        assertEquals(3652, dateTasks.getNumberOfDaysBetweenTwoDates("2012-09-21","2022-09-21"));
        assertEquals(0, dateTasks.getNumberOfDaysBetweenTwoDates("2022-09-21","2022-09-21"));
        assertEquals(38, dateTasks.getNumberOfDaysBetweenTwoDates("2021-11-23","2021-12-31"));
        assertEquals(8036, dateTasks.getNumberOfDaysBetweenTwoDates("2000-01-01","2022-01-01"));
        assertEquals(1, dateTasks.getNumberOfDaysBetweenTwoDates("1999-12-12","1999-12-13"));
        assertEquals(70, dateTasks.getNumberOfDaysBetweenTwoDates("2015-04-29","2015-07-08"));
    }

    @Test
    void getTheNextAndPreviousFriday() {
        assertArrayEquals(new String[] {"2021-07-23", "2021-07-30"}, dateTasks.getTheNextAndPreviousFriday("2021-07-27"));
        assertArrayEquals(new String[] {"2015-11-06", "2015-11-20"}, dateTasks.getTheNextAndPreviousFriday("2015-11-13"));
        assertArrayEquals(new String[] {"2017-10-27", "2017-11-03"}, dateTasks.getTheNextAndPreviousFriday("2017-11-01"));
        assertArrayEquals(new String[] {"1999-01-01", "1999-01-15"}, dateTasks.getTheNextAndPreviousFriday("1999-01-08"));
        assertArrayEquals(new String[] {"1995-03-10", "1995-03-17"}, dateTasks.getTheNextAndPreviousFriday("1995-03-16"));
        assertArrayEquals(new String[] {"2006-04-28", "2006-05-12"}, dateTasks.getTheNextAndPreviousFriday("2006-05-05"));
    }

    @Test
    void getNumberOfMonthsRemainingInTheYear() {
        assertEquals(11, dateTasks.getNumberOfMonthsRemainingInTheYear("2012-01-22"));
        assertEquals(0, dateTasks.getNumberOfMonthsRemainingInTheYear("1999-12-31"));
        assertEquals(3, dateTasks.getNumberOfMonthsRemainingInTheYear("2015-09-11"));
        assertEquals(9, dateTasks.getNumberOfMonthsRemainingInTheYear("1932-03-19"));
        assertEquals(6, dateTasks.getNumberOfMonthsRemainingInTheYear("2002-06-03"));
        assertEquals(1, dateTasks.getNumberOfMonthsRemainingInTheYear("2021-11-01"));
    }
}