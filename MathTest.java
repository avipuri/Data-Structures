//By Aviral Puri
//MathTest, Lab 4
//Created March 4
//This program performs a variety of methods along with a test class
//which tests them separately

import java.util.Scanner;

public class MathTest
{
   public static void main(String []args)
   // creates a main class with which we will we do the testing
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter 2 interger variables");
      int test1 = sc.nextInt();
      int test2 = sc.nextInt();
      // initializes our 2 test variables
      
      MathMethods myObject = new MathMethods();
      // creates a duplicate of our method in the actual class
      int addAns = myObject.additionMethod(test1, test2);
      // executes the duplicate method using the test var and stores into addAns
      System.out.println("Addition answer: " + addAns);
      
      int subAns = myObject.subtractionMethod(test1, test2);
      System.out.println("Subtraction answer: " + subAns);
      
      int productAns = myObject.productMethod(test1, test2);
      System.out.println("Product answer: " + productAns);
      
      double divisionAns = myObject.divisionMethod(test1, test2);
      System.out.println("Division answer: " + divisionAns);
   }
}