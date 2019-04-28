//By Aviral Puri
//OverloadedCoffeeMethods, Lab 4
//Created March 8
//This program performs tests the methods
//in OverloadedCoffeeMethods

public class OverloadedCoffeeTest
{
   public static void main(String []args)
   // creates a main class with which we will we do the testing
   {
      int coffeeCups = 5;
      int latteCups = 2;
      int espressoCups = 6;
      
      OverloadedCoffeeMethods myObject = new OverloadedCoffeeMethods();
      
      int totalPrice = myObject.calculateCoffeePrice(coffeeCups);
      System.out.println("Total price of coffee: $" + totalPrice);
      
      totalPrice = myObject.calculateCoffeePrice(coffeeCups, latteCups);
      System.out.println("Total price of coffee + latte: $" + totalPrice);
      
      totalPrice = myObject.calculateCoffeePrice(coffeeCups, latteCups, espressoCups);
      System.out.println("Total price of coffee + latte + espresso: $" + totalPrice);
   }
      
}