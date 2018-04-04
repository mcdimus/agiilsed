package com.airhacks;

public class SumExpr extends Expr {

    private final Expr a;
    private final Expr b;

    public SumExpr(Expr a, Expr b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int get() {
        return a.get() + b.get();
    }

}
