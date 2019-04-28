//By Aviral Puri
//DialogBoxPoem, Lab 2
//Created Jan 29, Due Jan 30
//This program output dialog boxes which display a short poem
//My program outputs a 3 line poem by Ernest Hemingway and my reaction

import javax.swing.JOptionPane;
//this library is required to use dialog boxes in java
public class DialogBoxPoem
{
   public static void main(String[] args)
   {//commands and format for outputting dialog boxes below
      JOptionPane.showMessageDialog(null, "For Sale:","Poem Line 1", 
      JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Baby Shoes,","Poem Line 2", 
      JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Never Worn.","Poem Line 3", 
      JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "-By Ernest Hemingway","Author", 
      JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Sad :(","Reaction", 
      JOptionPane.INFORMATION_MESSAGE);
   }
} 