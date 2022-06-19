package com.mac.calculator;

import java.util.Scanner;

public class CalculatorString {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String str = scanner.nextLine();
        scanner.close();
        ConditionCheck.check(str);


    }
}
