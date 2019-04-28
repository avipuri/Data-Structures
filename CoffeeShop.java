//By Aviral Puri
//Lab 1, CoffeeShop program
//This program calculates the total bill of a coffeeshop customer

import java.util.*;

public class CoffeeShop
{
    final static double PRICEOFCOFFEE = 2.35;
    final static double PRICEOFLATTE = 3.35;
    final static double PRICEOFESPRESSO = 2.50;
    final static double TAX = 0.09;

    public static double calculateCoffeePrice(int coffeeCups, int latteCups, int espressoCups)
    {
        double totalPrice = coffeeCups*PRICEOFCOFFEE + latteCups*PRICEOFLATTE
                + espressoCups*PRICEOFESPRESSO;

        return totalPrice * (1 + TAX);
    }
}