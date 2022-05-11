package com.example.simplecalculator;

public class Add {
    private double addendOne;
    private double addendTwo;

    public Add(double addendOne, double addendTwo){
        this.addendOne = addendOne;
        this.addendTwo = addendTwo;
    }
    public String toString(){
        double ans = addendOne + addendTwo;
        return String.valueOf(ans);

    }

}