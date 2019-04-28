//By Aviral Puri
//QuickMaths, Lab 3
//This program calculates boxes needed in order to store books

import javax.swing.JOptionPane;
public class QuickMaths
{
   
   public static void main(String[] args)
   {
      int amountOrdered = 0;
      int boxesNeeded = 0;
      int booksLeft = 0;
      String orderInput;
      //Dialog input must be stored in a string data type
      orderInput = JOptionPane.showInputDialog(
           "Please input number of books ordered");
       amountOrdered = Integer.parseInt(orderInput);
       boxesNeeded = amountOrdered / 15;
       booksLeft = amountOrdered % 15;
       
       if (amountOrdered < 15)
       {
         System.out.print("Boxes needed: 1, Books leftover: 0"); 
       }
       else
       {
         System.out.print("Boxes needed: " + boxesNeeded + 
                         ", Books leftover: " + booksLeft);
       }
   }
}