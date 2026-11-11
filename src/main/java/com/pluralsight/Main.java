package com.pluralsight;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        float f = 0.0f;
        double d = 0.0;
        BigDecimal bD = BigDecimal.ZERO;
        int loopNum = 10;

        for (int i = 0; i < loopNum; i++) {
            f += 0.1f;
            d += 0.1;
            bD = bD.add(new BigDecimal("0.1"));
            System.out.println("Float: " + f + " Double: " + d + " BigDecimal: " + bD);
        }

        f = 0.0f;
        d = 0.0;
        bD = BigDecimal.ZERO;
        loopNum = 1000;

        for (int i = 0; i < loopNum; i++) {
            f += 19.99f;
            d += 19.99;
            bD = bD.add(new BigDecimal("19.99"));
        }
        System.out.println("Float: " + f + " Double: " + d + " BigDecimal: " + bD);

        BigDecimal fBD = new BigDecimal(f);
        BigDecimal dBD = new BigDecimal(d);

        compare(fBD, dBD);
        compare(dBD, bD);

    }

    public static void compare(BigDecimal num1, BigDecimal num2) {
        int result = num1.compareTo(num2);
        switch (result) {
            case -1 -> {
                System.out.println(num1 + " is less than " + num2);
            }
            case 0 -> {
                System.out.println(num1 + " is equal to " + num2);
            }
            case 1 -> {
                System.out.println(num1 + " is greater than " + num2);
            }
            default -> System.out.println("Error");
        }
    }
}
