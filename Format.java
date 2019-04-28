//By Aviral Puri
//Format Phone number, Lab 8
//Created April 29
//This program formats a string to different specifications

import java.util.*;

public class Format
{
   public static void phoneFormat() 
   {
      Scanner phonescan = new Scanner(System.in);//Initialize scanner
      String phonenum;//Initialise string to store phone number
     
      System.out.println("Enter your phone number: ");//Prompts user
      System.out.println("Or enter 999 to Exit");
      phonenum = phonescan.next();//Gets phone number
      System.out.println("You entered " + phonenum);
      
      boolean exitcode = false;//Initialize exitcode variable
      
      while(exitcode == false)//while phoneum isn't 999
      {
      if(phonenum.length()!=10 && !phonenum.equals("999"))
      {
         System.out.println("Invalid number");//Prompts user
         System.out.println("Enter your phone number: ");
         phonenum = phonescan.next();//Gets phone number
         }
         
         if(phonenum.length()==10)//If it's an actual phone number
         {
         String areacode = phonenum.substring(0,3);//Split the phone number
         String nxtthree = phonenum.substring(3,6);
         String lastfour = phonenum.substring(6,10);
         System.out.println("Formatted phone number:\n("+areacode+")"
                                             +nxtthree+"-"+lastfour);//print it out
         phonenum = phonescan.next();//Get next phone number
         }
      
      if(phonenum.equals("999"))//If it's exitcode
      {
         exitcode = true;//Set exitcode to true
      }
      
   
      }
      
   }
}
