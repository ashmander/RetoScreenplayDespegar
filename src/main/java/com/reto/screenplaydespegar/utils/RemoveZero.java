package com.reto.screenplaydespegar.utils;

public class RemoveZero {

    public static String removeZero(String day) {
        return day.charAt(0) == '0' ? String.valueOf(day.charAt(1)) : day;
    }
}
