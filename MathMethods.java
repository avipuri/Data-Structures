//By Aviral Puri
//MathMethods, Lab 4
//Created March 4
//This program performs a variety of methods along with a test class
//which tests them separately
public class MathMethods
//creates a public class for our methods
{
   public static int additionMethod (int int1, int int2)
   //initializes the add method and declares its parameters and vars
   {
      int int3 = int1 + int2;
      //performs the mathematical task
      return int3;
      //returns the final ans which will be 
      //stored and printed by test class
   }
   public static int subtractionMethod (int int1, int int2)
   {
      int int3 = int1 - int2;
      return int3;
   }
   public static int productMethod (int int1, int int2)
   {
      int int3 = int1*int2;
      return int3;
   }
    public static double divisionMethod (int int1, int int2)
   {
      double int3 = ((double)int1)/int2;
      return int3;
   }
   
}