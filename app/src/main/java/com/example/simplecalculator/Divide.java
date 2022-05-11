package com.example.simplecalculator;

public class Divide {
    private double dividend;
    private double divisor;

    public Divide(double dividend, double divisor){
        this.dividend = dividend;
        this.divisor = divisor;
    }
    private double getQuotient(){
        return dividend/divisor;
    }
    private  double getRemainder(){
        return dividend%divisor;
    }
    public String toString(){
         //return String.valueOf(getQuotient())+"R: "+String.valueOf(getRemainder());
        return String.valueOf(getQuotient());
    }
}
