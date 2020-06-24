package com.lysachenko;

public class SelfCount {

    private static int count;

    public SelfCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
