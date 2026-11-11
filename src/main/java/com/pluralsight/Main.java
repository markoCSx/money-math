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



        System.out.println();

    }
}
