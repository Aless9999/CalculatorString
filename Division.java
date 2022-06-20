package com.mac.calculator;

public class Division {
    public static void divis(String[] strArrow, int n) throws Exception {
        if (n <= 0 || n > 10) {
            throw new Exception("Число не может быть меньше 1 и больше 10.");
        } else {
            String word1Divis = strArrow[1];
            StringBuilder builder = new StringBuilder();
            if (n == 1) {
                System.out.println("\"");
            } else if (n == 2) {
                System.out.println("\"" + word1Divis.charAt(0));

            } else {

                for (int i = 0; i < n - 2; i++) {
                    builder.append(word1Divis.charAt(i));

                }
                System.out.println("\"" + builder + "\"");
            }
        }
    }
}
