package com.airhacks;

public class NumericExpr extends Expr {

    private final int value;

    public NumericExpr(int value) {
        this.value = value;
    }

    public NumericExpr(String value) {
        if (value == null || value.isEmpty()) {
            value = "0";
        }
        this.value = Integer.parseInt(value);
    }

    @Override
    public int get() {
        return value;
    }

}
