import java.util.*;

public class DonutsAndRolls
{
   public static void bagsNeeded()
   {
      String[] names = new String[] {"Mary","John", "dave", "Sue", "Tom", "Jill"};
      int[] donuts = new int[] {15,12,0,3,5,0};
      int[] rolls = new int[] {6,0,13,11,0,7};
      int bags;
      //The above code simply creates arrays and date for testing
      
      System.out.printf("%-8s\t%-6s\t%-6s\t%-6s\n","Names", "Donuts","Rolls","Bags");
      //Prints a header output
    
      for(int i = 0; i < names.length; i++)
         {//Normal for loop is used to iterate through the customer list
         int donutBags = donuts[i]/6;//donut bags calculation
         
         if(donuts[i]%6 != 0)
            donutBags += 1;//adds a bag if donuts are not exact multiple of 6
            
         int rollBags = rolls[i]/4;//roll bags calculation
         
         if(rolls[i]%4 != 0)
            rollBags += 1;//adds a bag if rolls are not exact multiple of 4
            
         bags = donutBags + rollBags;//adds the two bag calculations to get total bags
         
         System.out.printf("%-8s\t%-6d\t%-6d\t%-6d\n",names[i], donuts[i], rolls[i], bags);
         //print format is used to output information in columns of set width 
         }
      
   
   }
}