//By Aviral Puri
//ChargesPrintIn, Lab 1
//Created Jan 18, Due Jan 25
//This program prints a billing statement


public class ChargesPrintln //creates a class called ChargesPrintln
{
   public static void main (String [] args) 
   //main calls the instructions within the
   //class body so that JVM can start the exucution
   {// bracket define the beginning and end of a class body
      int totalCharges = 53;
      int overdueCharges = 0;
      //int defines the type of the data stored as an integer
      System.out.print ("Your current bill is $");
      //simply prints the string output
      //there are quotations inside the parenthesis 
      //because it contains a string 
      System.out.println (totalCharges);
      //prints the output and starts a new line
      //there are no quotations because it is outputing 
      //an integer previously stored in totalCharges
      System.out.println ("Overdue charges: $" + 
      //the plus sign appends the data in overdueCharges 
      //to the string before it
                                 overdueCharges);
      //the last line is simply a continuation of the previous line
      //it outputs the int in overdueCharges 
      //it has no specific purpose other than readbility
      //and formattingstyle                      
   }
}