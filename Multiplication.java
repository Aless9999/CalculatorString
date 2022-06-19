package com.mac.calculator;

public class Multiplication {
    public static void multip(String[] strArrow, int n) throws Exception {
        if (n <= 0 || n > 10) {
            throw new Exception("Число не может быть меньше 1 и больше 10.");
        } else {
            String word1Mult = strArrow[1];

            StringBuilder builder = new StringBuilder();
            builder.append(String.valueOf(word1Mult).repeat(n));
            if (builder.length() > 40) {
                System.out.println("\"" + builder + "..." + "\"");
            } else {
                System.out.println("\"" + builder + "\"");
            }
        }
    }
}

