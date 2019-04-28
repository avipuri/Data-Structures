//By Aviral Puri
//Looping, Lab 7
//Created April 24
//This program counts by three from 3 through 300 inclusive, 
//and. that starts a newline after every multiple of 30

public class Counter
{
   public static void countByThree()
   {


   int n = 0;//Initializes variables
   int d = 0;
   double dubd = 0;
   
   for(int i=1; i<=100; i++)//For 100 iterations
   {
      n = i*3;//Multiply n by 3
      System.out.print(" "+n);//Print it
      d = n/30;//d is the integer division result
      dubd = (double)n/30;//dubd is the double division result
      if(d==dubd)//If n is an even multiple of 30
      System.out.printf("\n");//Print 30
     }
   }
}
