import java.util.*;

public class BonusCalculation 
{
   public static void main (String[] arguments)
   {
      String[] Names = new String[] {"Bob","Christine","Cristofer","Dylan","Kara","Zebra"};
      int[] Scores = new int[] {3,3,3,3,3,3};
      double[] AnnualSalary = new double[] {150000,162000,30000,400000,120000,135000};
      
      // We are using double because we need to be precise with decimal values
      double[] AddedBonus = new double[6];
      double[] TotalSalary = new double[6];
      
      for (int i=0; i<6; i++)
      {
         if (Scores[i] == 3)
         {
            AddedBonus[i] = (AnnualSalary[i] * 0.01);
            TotalSalary[i] = (AddedBonus[i] + AnnualSalary[i]);
         }
         //System.out.println(Names[i]+"\t"+Scores[i]+"\t"+AnnualSalary[i]+"\t"+AddedBonus[i]+"\t"+TotalSalary[i]);
         System.out.printf("%-10s\t%d\t%-9.2f\t%-8.2f\t%-11.2f\n",Names[i], Scores[i], AnnualSalary[i], AddedBonus[i], TotalSalary[i]);
      } 
   }
}
