//By Aviral Puri
//Lab 1, CoffeeShop Program Tester
//This program tests the calculation method and
//uses a loop to allow multiple customers to order drinks

import java.util.*;

public class CoffeeShopTest
{
    public static void main(String []args)
    // creates a main class with which we will we do the testing
    {
        int coffeeCups;
        int latteCups;
        int espressoCups;

        CoffeeShop myObject = new CoffeeShop();

        Scanner coffeescan = new Scanner(System.in);//Initialize scanner

        boolean exitcode = false;//Initialize exitcode variable

        while(exitcode == false)//while exitcode is not true
        {
            coffeeCups = 0;
            latteCups = 0;
            espressoCups = 0;
            System.out.println("How many cups of coffee do you want?");
            coffeeCups += coffeescan.nextInt();
            System.out.println("How many cups of latte do you want?");
            latteCups = coffeescan.nextInt();
            System.out.println("How many cups of espresso do you want?");
            espressoCups = coffeescan.nextInt();
            double totalPrice = myObject.calculateCoffeePrice(coffeeCups, latteCups, espressoCups);
            totalPrice = java.lang.Math.round(totalPrice * 100)/100.0;
            System.out.println("Total price of coffee: $" + totalPrice);

            System.out.println("Would you like to make another order? (YES/NO)");
            String response = coffeescan.next();
            if(response.equals("NO"))
            {
                exitcode = true;//Set exitcode to true
            }
        }
    }
}