package com.example.simplecalculator;

public class Divide {
    private double dividend;
    private double divisor;

    public Divide(double dividend, double divisor){
        this.dividend = dividend;
        this.divisor = divisor;
    }
    private int getQuotient(){
        return (int) (dividend/divisor);
    }
    private  int getRemainder(){
        return (int) (dividend%divisor);
    }
    public String toString(){
         return "Q: "+String.valueOf(getQuotient())+" R: "+String.valueOf(getRemainder());
        //return String.valueOf(getQuotient());
    }
}
