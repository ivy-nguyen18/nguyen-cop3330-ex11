/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex11.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double euros = input.nextDouble();

        System.out.print("What is the exchange rate? ");
        double exchangeRate = input.nextDouble();

        Currency convert = new Currency(euros, exchangeRate);

        //System.out.printf("%d euros at an exchange rate of %.2f is%n%.2f U.S. dollars.", (int)euros, exchangeRate, convert.conversion());
        String output = (String.format("%.2f", euros) + " euros at an exchange rate of " + exchangeRate + " is\n" + String.format("%.2f", convert.conversion()) + " U.S. dollars.");

        System.out.println(output);

    }
}
