package com.sparta.mg.enums;

import java.util.Arrays;

public enum Days {
    MON,
    TUE,
    WED,
    THU,
    FRI;

    public static void main(String[] args) {
        Days workDay = Days.MON;
        Days lastDay = Days.FRI;
        System.out.println(Arrays.toString(Days.values()));
    }
}
