package com.knubisoft.base.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import static java.time.LocalDate.*;
import static java.time.format.DateTimeFormatter.*;

public class DateTasksImpl implements DateTasks {

    @Override
    public String add1Day(String date) {
        LocalDate localDate = parse(date);
        return localDate.plusDays(1).toString();
    }

    @Override
    public int getMonthFromDate(String date) {
        var formatter = ofPattern("EEE, d MMM yyyy", Locale.ENGLISH);
        var localDate = parse(date, formatter);
        return localDate.getMonth().getValue();
    }

    @Override
    public String findBiggestDate(String date1, String date2, String date3) {
        String[] array = {date1, date2, date3};
        DateTimeFormatter formatter = ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime[] dateTimes = new LocalDateTime[array.length];
        for (int i = 0; i < array.length; i++) {
            dateTimes[i] = LocalDateTime.parse(array[i], formatter);
        }
        for (int i = 0; i < dateTimes.length; i++) {
            for (int j = 0; j < dateTimes.length - i - 1; j++) {
                if (dateTimes[j].isAfter(dateTimes[j + 1])) {
                    LocalDateTime temp = dateTimes[j + 1];
                    dateTimes[j + 1] = dateTimes[j];
                    dateTimes[j] = temp;
                }
            }
        }
        return dateTimes[dateTimes.length - 1].format(formatter);
    }

    @Override
    public String getLastDayOfTheMonth(String date) {
        LocalDate originalDate = parse(date);
        int days = originalDate.lengthOfMonth();
        LocalDate result = originalDate.plusDays(days - originalDate.getDayOfMonth());
        return result.toString();
    }

    @Override
    public String sumTimes(String time1, String time2) {
        DateTimeFormatter formatter = ofPattern("HH:mm:ss");
        return LocalTime.parse(time1).plusSeconds(LocalTime.parse(time2).toSecondOfDay()).format(formatter);
    }

    @Override
    public String getDateAfter2Weeks(String date) {
        LocalDate originalDate = parse(date);
        LocalDate newDate = originalDate.plusWeeks(2);
        return newDate.toString();
    }

    @Override
    public long getNumberOfDaysBetweenTwoDates(String date1, String date2) {
        return Math.abs(parse(date1).toEpochDay() - parse(date2).toEpochDay());
    }

    @Override
    public String[] getTheNextAndPreviousFriday(String date) {
        String[] res = new String[2];
        LocalDate localDate = parse(date);
        for (int j = -1; j >= -7; j--) {
            LocalDate nextDay = localDate.plusDays(j);
            if (nextDay.getDayOfWeek() == DayOfWeek.FRIDAY) {
                res[0] = nextDay.toString();
                break;
            }
        }
        for (int j = 1; j <= 7; j++) {
            LocalDate nextDay = localDate.plusDays(j);
            if (nextDay.getDayOfWeek() == DayOfWeek.FRIDAY) {
                res[1] = nextDay.toString();
                break;
            }
        }
        return res;
    }

    @Override
    public int getNumberOfMonthsRemainingInTheYear(String date) {
        LocalDate originalDate = parse(date);
        int numberOfMonth = originalDate.getMonthValue();
        int res = 12 - numberOfMonth;
        return res;
    }
}
