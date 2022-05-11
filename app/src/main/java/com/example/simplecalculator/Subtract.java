package com.example.simplecalculator;

public class Subtract {
    private double minuend;
    private double subtrahend;

    public Subtract(double minuend, double subtrahend){
        this.minuend = minuend;
        this.subtrahend =subtrahend;
    }
    public String string(){
        double ans = minuend - subtrahend;
        return String.valueOf(ans);
    }
}
