package com.airhacks;

public class SubtractExpr extends Expr {

    private final Expr a;
    private final Expr b;

    public SubtractExpr(Expr a, Expr b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int get() {
        return a.get() - b.get();
    }

}
