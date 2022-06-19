package com.mac.calculator;

public class Sum {
    public static void summa(String word1, String word2) throws Exception {

        char symbolWord2 = word2.charAt(0);

        boolean check2 = Character.isDigit(symbolWord2);
        if (check2) {
            System.out.println("\"" + word1 + word2 + "\"");
            ;
        } else {
            System.out.println("\"" + word1 + " " + word2 + "\"");
        }
    }
}
