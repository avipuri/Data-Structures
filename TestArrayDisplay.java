
public class TestArrayDisplay
{
   public static void main (String [] arguments)
   {
      ArrayDisplay test1 = new ArrayDisplay();
      
      System.out.println("\n1. Displaying all elements");
      test1.displayAll();
      
      System.out.println("\n2. Displaying elements in reverse");
      test1.displayReverse();
      
      System.out.println("\n3. Displaying even elements");
      test1.displayEven();
      
      System.out.println("\n4. Displaying sum");
      test1.displaySum();
      
      System.out.println("\n5. Displaying above average elements");
      test1.aboveAverage();
   }
}