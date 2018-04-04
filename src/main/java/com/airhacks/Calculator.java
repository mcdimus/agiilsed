package com.airhacks;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

//    public int run(String input) {
//        Expr expr = new NumericExpr(0);
//
//        String value1 = "";
//        String value2 = "";
//        String operation = "";
//        boolean searchForSecond = false;
//        for (int i = 0; i < input.length(); i++) {
//            char currentSymbol = input.charAt(i);
//            if (Character.isDigit(currentSymbol) && !searchForSecond) {
//                value1 += Character.toString(currentSymbol);
//            } else if (Character.isDigit(currentSymbol) && searchForSecond) {
//                value2 += Character.toString(currentSymbol);
//            } else if (!searchForSecond && (currentSymbol == '+' || currentSymbol == '-')) {
//                operation = Character.toString(currentSymbol);
//                searchForSecond = true;
//            } else {
//                switch (operation) {
//                    case "+":
//                        expr = new SumExpr(new NumericExpr(value1), new NumericExpr(value2));
//                        break;
//                    case "-":
//                        expr = new SubtractExpr(new NumericExpr(value1), new NumericExpr(value2));
//                        break;
//                }
//                value1 = "";
//                value2 = "";
//            }
//        }
//        switch (operation) {
//            case "+":
//                expr = new SumExpr(new NumericExpr(value1), new NumericExpr(value2));
//                break;
//            case "-":
//                expr = new SubtractExpr(new NumericExpr(value1), new NumericExpr(value2));
//                break;
//        }
//        return expr.get();
//    }

    public int run(String input) {
        Expr expr = new NumericExpr(0);

        String value = "";
        String operation = "+";
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol == '-' || currentSymbol == '+') {
                switch (operation) {
                    case "+":
                        expr = new SumExpr(expr, new NumericExpr(value));
                        break;
                    case "-":
                        expr = new SubtractExpr(expr, new NumericExpr(value));
                        break;
                }
                operation = Character.toString(currentSymbol);
                value ="";
            } else if (Character.isDigit(currentSymbol)) {
                value += Character.toString(currentSymbol);
            }
        }
        switch (operation) {
            case "+":
                expr = new SumExpr(expr, new NumericExpr(value));
                break;
            case "-":
                expr = new SubtractExpr(expr, new NumericExpr(value));
                break;
        }
        return expr.get();
    }

}