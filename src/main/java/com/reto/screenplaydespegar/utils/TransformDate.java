package com.reto.screenplaydespegar.utils;

import java.time.LocalDate;

import static com.reto.screenplaydespegar.utils.RemoveZero.removeZero;

public class TransformDate {

    public static String getYearAndMonth(LocalDate date) {
        return date.toString().split("-")[0] + "-" + date.toString().split("-")[1];
    }

    public static String getDay(LocalDate date) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>" + removeZero(date.toString().split("-")[2]));
        return removeZero(date.toString().split("-")[2]);
    }

    public static LocalDate tomorrow() {
        LocalDate todayDate = LocalDate.now();
        LocalDate tomorrowDate = todayDate.plusDays(1);
        return tomorrowDate;
    }

    public static LocalDate threeDaysAfterTomorrow() {
        LocalDate todayDate = LocalDate.now();
        LocalDate threeDaysAfter = todayDate.plusDays(4);
        return threeDaysAfter;
    }
}
