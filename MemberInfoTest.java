//By Aviral Puri
//Lab 2, LinkedList
//This program implements the ADT MemberInfo and inputs data

import java.util.*;

public class MemberInfoTest
{
    public static void main (String [] args)
    {
        MemberInfo[] items = {new MemberInfo("Jack",1000000000,"test st, san mateo, 94403"), 
                              new MemberInfo("Jill",2000000000,"test st, san mateo, 94403"),
                              new MemberInfo("Fill",300000000,"test st, san mateo, 94403"),
                              new MemberInfo("John",400000000,"test st, san mateo, 94403"),
                              new MemberInfo("Vohn",500000000,"test st, san mateo, 94403"),
                              new MemberInfo("Bone",600000000,"test st, san mateo, 94403"),
                              new MemberInfo("Post",700000000,"test st, san mateo, 94403"),
                              new MemberInfo("Jack",800000000,"test st, san mateo, 94403"),
                              new MemberInfo("Jack",900000000,"test st, san mateo, 94403"),
                              new MemberInfo("Jack",110000000,"test st, san mateo, 94403"),
                              new MemberInfo("Xtra",120000000,"test st, san mateo, 94403"),
                              new MemberInfo("More",1300000000,"test st, san mateo, 94403")};
        
       BagInterface<MemberInfo> list1 = new LinkedBag<MemberInfo>();
       
        
       for (int index = 0; index < items.length; index++)
        {
            MemberInfo nextItem = items[index];
            list1.add(nextItem);
          
            System.out.println(items[index]);
        }
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a name to check");
       String input = sc.next();
       MemberInfo searchInput = new MemberInfo(input, 0 , null);
       //System.out.println(input);
       //System.out.println(searchInput);
       
       
      if(list1.contains(searchInput))
      {
         System.out.println(input + " is a member.");
      }
      else
      {
         System.out.println(input + " is not a member.");
      }
      
      
              
        
    }
    
}
