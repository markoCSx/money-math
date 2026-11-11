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

        BigDecimal fBD = BigDecimal.valueOf(f);
        BigDecimal dBD = BigDecimal.valueOf(d);

        System.out.println("Comparing Float and Double");
        compare(fBD, dBD);
        System.out.println("Comparing Double and BigDecimal");
        compare(dBD, bD);

        BigDecimal num1 = BigDecimal.ONE;
        System.out.println(num1);
        num1 = new BigDecimal("1");
        System.out.println(num1);
        num1 = BigDecimal.valueOf(1);
        System.out.println(num1);

        /* Questions to answer:
        *How many cents is the float off after 1000 iterations?
        * 184 cents <-- I got corrected --> 18 cents whoops!
        *
        *Why does the BigDecimal print 1.00 and not 1?
        *Because it was working with decimals
        *
        * What happens if you call .add(); without assigning the result back to your variable?
        *.add() returns the sum, does not affect the variable unless you specifically assign it
        * */

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
