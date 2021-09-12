/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int euros;
        double exchangeRate;
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        euros = input.nextInt();

        System.out.print("What is the exchange rate? ");
        exchangeRate = input.nextDouble();

        System.out.print(euros + " euros at an exchange rate of " + exchangeRate + " is\n" + Math.round(euros * exchangeRate * 100.0) / 100.0+ " U.S. dollars.");
    }
}