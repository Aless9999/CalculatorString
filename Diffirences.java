package com.mac.calculator;

public class Diffirences {
    public static void differ(String word1, String word2)  {

        boolean result = word1.contains(word2);

        if (result) {
            System.out.println("\"" + word1.replace(word2, "") + "\"");
        } else {
            System.out.println("\"" + word1 + "\"");
        }
    }
}
