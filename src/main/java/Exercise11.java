/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brooke Fuller
 */
import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;


public class Exercise11 {
    public static void main(String[] args) {

        System.out.println("How many euros are you exchanging? ");
        Scanner input = new Scanner(in);
        String euros = input.nextLine();
        double euro = Double.parseDouble(euros);

        System.out.println("What is the exchange rate? ");
        Scanner input2 = new Scanner(in);
        String rate = input2.nextLine();
        double exchange_rate = Double.parseDouble(rate);

        double eurotodollar = euro * exchange_rate;
        double euro_rounded = Math.round(euro * 100.0) / 100.0;
        double total_rounded = Math.round(eurotodollar * 100.0) / 100.0;

        System.out.println(euro_rounded + " euros at an exchange rate of "
                + exchange_rate + " is " + total_rounded + " U.S. dollars.");
    }
}
