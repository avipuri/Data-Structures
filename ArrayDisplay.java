//By Aviral Puri
//Array, Lab 9
//Created May 10
//This program displays an array in different ways using 5 methods

public class ArrayDisplay
{
   int[] mainArray = mainArray = new int[] {0,1,1,2,3,5,8,13,21,1000000};
   
   
   public void displayAll()//Prints all elements in the array
   {
      for (int i=0; i<(mainArray.length);i++)
         
      {
         System.out.println("mainArray[" + i + "]: " + mainArray[i]);
      }
   }
  
   public void displayReverse()//Prints the elements in the array backwards
   {
      for (int i=(mainArray.length-1); i>=0; i--)
      {
         System.out.println("mainArray[" + i + "]: " + mainArray[i]);
      }
   }
   
   public void displayEven()//Prints the even elemts of the array
   {
      for (int i=1; i<=mainArray.length-1; i++)
      {
         if(mainArray[i]%2==0)
         {
            System.out.println("mainArray[" + i + "]: " + mainArray[i]);
          }
      }
   }

   public void displaySum()//Computes and displays the sum of the elements in the array
   {
      int sum = 0;//Initializes variables for sums
      
      for (int i=0; i<mainArray.length; i++)//Iteratively computes su
      {
         sum += mainArray[i];
      }
      
      System.out.println("Sum: " + sum);
   }
   
   public void aboveAverage()
   {
      int sum = 0;//Initializes variables for sums
      
      for (int i=0; i<mainArray.length; i++)//Iteratively computes su
      {
         sum += mainArray[i];
      }
      
      double average = sum / mainArray.length;//Compute the average
      
      for (int i=0; i<mainArray.length; i++)//Print elements greater than average
      {
         if (mainArray[i] > average)
         {
            System.out.println("mainArray[" + i + "]: " + mainArray[i]);
         }
      }
   }
   
}