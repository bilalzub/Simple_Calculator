package com.example.simplecalculator;

public class Multiply {
    private double multiplicand;
    private double multiplier;

    public Multiply(double multiplicand, double multiplier){
        this.multiplicand = multiplicand;
        this.multiplier = multiplier;
    }
    public String toString(){
        double ans = multiplicand*multiplier;
        return String.valueOf(ans);
    }

}
