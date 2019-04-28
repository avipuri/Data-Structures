//By Aviral Puri
//OverloadedCoffeeMethods, Lab 4
//Created March 8
//This program performs a variety of methods that 
//calculate the price of coffee along with a test 
//class which tests them separately

public class OverloadedCoffeeMethods
{
   public static int calculateCoffeePrice(int coffeeCups)
   {
      final int PRICEOFCOFFEE = 4;
      
      int totalPrice = coffeeCups*PRICEOFCOFFEE;
      
      return totalPrice;
   }
   
   public static int calculateCoffeePrice(int coffeeCups, int latteCups)
   {
      final int PRICEOFCOFFEE = 4;
      final int PRICEOFLATTE = 5;
     
      int totalPrice = coffeeCups*PRICEOFCOFFEE + latteCups*PRICEOFLATTE;
      
      return totalPrice;
   }
   
   public static int calculateCoffeePrice(int coffeeCups, int latteCups, int espressoCups)
   {
      final int PRICEOFCOFFEE = 4;
      final int PRICEOFLATTE = 5;
      final int PRICEOFESPRESSO = 3;
     
      int totalPrice = coffeeCups*PRICEOFCOFFEE + latteCups*PRICEOFLATTE 
                                                + espressoCups*PRICEOFESPRESSO;
      
      return totalPrice;
   }
}