//By Aviral Puri
//Lab 2, LinkedList
//This program creates a ADT for library card holders

public class MemberInfo
{
    private String name;
    private int cardNum;
    private String address;

    public MemberInfo (String newName, int newCardNum, String newAddress)
    {
        name = newName;
        cardNum = newCardNum;
        address = newAddress;
    }
    
    public void setName(String memberName)
    {
        name = memberName;
    }
    
    public void setCardNum(int memberCardNum)
    {
        cardNum = memberCardNum;
    }
    
    public void setAddress(String memberAddress)
    {
        address = memberAddress;
    }

    public String getName()
    {
        return name;
    }
    
    public int getCardNum()
    {
        return cardNum;
    }
    
    public String getAddress()
    {
        return address;
    }
    public boolean equals(Object value)
    {
      boolean ans = false;
      if(value instanceof MemberInfo)
      {
         MemberInfo value1 = (MemberInfo) value;
         if(getName().equals(value1.getName()))
         ans = true;
      }
      
      return ans;
    }
    
    public String toString()
    {
    return name + "\t," + cardNum + "\t," + address;
    } // end toString
}