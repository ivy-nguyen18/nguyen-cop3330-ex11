 /*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */
package ex11.base;

public class Currency {
    private double euros;
    private double exchangeRate;
    static final double US_EXRATE = 100.00;

    public Currency (double euros, double exchangeRate){
        this.euros = euros;
        this.exchangeRate = exchangeRate;
    }

    public double conversion(){
        return euros * exchangeRate;
    }
}
