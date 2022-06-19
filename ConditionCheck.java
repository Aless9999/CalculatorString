package com.mac.calculator;

import static java.lang.Integer.*;

public class ConditionCheck {
    public static void check(String str) throws Exception {
        String[] strArrow = str.split("[^-a-z\\w !*/]");// Переводим строку в массив.
        String nString = strArrow[2].replaceAll("[A-z\\\\*\"+/W !-]", "");

        char symbol = (str.replaceAll("[a-z\\w !\"]", "")).charAt(0);//Знак действия
        String strCheck = str.replaceAll("\\s+", "");
        String[] checkQuote = strCheck.split("[^a-z\\w! \"]");
        char quote1 = checkQuote[0].charAt(0);
        char quote2 = checkQuote[0].charAt(checkQuote[0].length() - 1);

        if (quote1 != '"' || quote2 != '"') {
            throw new Exception("Неправильный формат ввода строки.");
        }
        String word1 = (strArrow[1].replace("\"", "")).trim();//Выражение 1
        String word2 = (strArrow[strArrow.length - 1].replace("\"", "")).trim();//Выражение 2
        if (word1.length() > 10 || word2.length() > 10) {
            throw new Exception("Длинна строки не может быть больше десяти символов.");
        }

        char quote3 = checkQuote[checkQuote.length - 1].charAt(0);
        char quote4 = checkQuote[checkQuote.length - 1].charAt(checkQuote[checkQuote.length - 1].length() - 1);
        if (symbol == '+' || symbol == '-') {
            if (quote3 != '"' || quote4 != '"') {
                throw new Exception("Неправильный формат ввода строки.");
            } else if (symbol == '+') {
                Sum.summa(word1, word2);
            } else if (symbol == '-') {

                Diffirences.differ(word1, word2);

            }


        } else if (symbol == '*' || symbol == '/') {
            if (quote3 == '"' || quote4 == ('"')) {
                throw new Exception("Неправильный формат ввода строки.");
            }
            if (symbol == '*') {
                if (strArrow.length <= 3) {
                    int n = parseInt(nString);
                    Multiplication.multip(strArrow, n);

                } else {
                    throw new Exception("Число должно быть целым.");
                }
            } else if (symbol == '/') {
                int n = parseInt(nString);

                if (strArrow.length <= 3) {
                    Division.divis(strArrow, n);
                } else {
                    throw new Exception("Число должно быть целым.");
                }
            }
        }
    }
}
