/**
    A class of bags whose entries are stored in a chain of linked nodes.
    The bag is never full.
    @author Frank M. Carrano
    @version 4.0
*/
public final class LinkedBag<MemberInfo> implements BagInterface<MemberInfo>
{
    Node firstNode;
    int numberOfEntries;


  // Simple constructor
    public LinkedBag()
    {
        firstNode = null;
        numberOfEntries = 0;
    } // end default constructor


    /** Gets the number of entries currently in this bag.
    @return  The integer number of entries currently in the bag. */
    public int getCurrentSize()
    {
        return numberOfEntries;
    }  // end
    

    /** Sees whether this bag is empty.
    @return True if the bag is empty, false otherwise.
    */
    public boolean isEmpty()
    {
        return firstNode == null;
    }  // end


    /** Adds a new entry to this bag.
        @param newEntry  The object to be added as a new entry.
        @return  true. */
    public boolean add(MemberInfo newEntry)
    {
        Node newNode = new Node (newEntry);
        newNode.next = firstNode;
        firstNode = newNode;
        ++numberOfEntries;
        return true;
    }  // end


    /** Removes one unspecified entry from this bag, if possible.
    @return  Either the removed entry, if the removal
    was successful, or null. */
    public MemberInfo remove()
    {
        MemberInfo result = null;
        if (firstNode != null)
        {
            result = firstNode.data;
            firstNode = firstNode.next;
            --numberOfEntries;    
        }
        return result;
    }  // end


    /**adsj;ajdf;l
    */
    private Node getReferenceTo (MemberInfo anEntry)
    {
        Node currentNode = firstNode;
        boolean found = false;
        while (!found && currentNode != null)
        {
            if (anEntry.equals (currentNode.data))
               found = true;
            else
               currentNode = currentNode.next;
        }
        return currentNode;
    }
    
    
    
   
    /** Removes one occurrence of a given entry from this bag.
    @param anEntry  The entry to be removed.
    @return  True if the removal was successful, or false otherwise. */
    public boolean remove(MemberInfo anEntry)
    {
        boolean result = false;
        Node currentNode = getReferenceTo (anEntry);
        if (currentNode != null)
        {
            currentNode.data = firstNode.data;
            firstNode = firstNode.next;
            --numberOfEntries;
            result = true;
        }
        return result;
        
    }  // end



    /** Removes all entries from this bag. */
    public void clear()
    {
        while (!isEmpty())
          {
              remove ();
          }
      numberOfEntries = 0;
    }  // end


    /** Counts the number of times a given entry appears in this bag.
    @param anEntry  The entry to be counted.
    @return  The number of times anEntry appears in the bag. */
    public int getFrequencyOf(MemberInfo anEntry)
    {
        Node currentNode = firstNode;
        int frequency = 0;
        while (currentNode != null)
        {
            if (anEntry.equals (currentNode.data))
               ++frequency;
            currentNode = currentNode.next;
        }
        return frequency;
    }  // end


    /** Tests whether this bag contains  a given entry.
    @param anEntry  The entry to locate.
    @return  True if the bag contains anEntry, or false otherwise. */
    public boolean contains(MemberInfo anEntry)
    {
        Node currentNode = getReferenceTo (anEntry);
        return !(currentNode == null);
    }  // end


    /** Retrieves all entries that are in this bag.
    @return  A newly allocated array of all the entries in this bag. */
    public MemberInfo[] toArray()
    {
        @SuppressWarnings ("unchecked")
        MemberInfo[] result = (MemberInfo[]) new Object[numberOfEntries];
        int index = 0;
        Node currentNode = firstNode;
        while (currentNode != null)
        {
            result [index] = currentNode.data;
            ++index;
            currentNode = currentNode.next;
        }
        return result;
    }


private class Node
{
    private MemberInfo data;
    private Node next;

//  Two contructors.
    private Node (MemberInfo dataPortion)
    {
        this (dataPortion, null);
    }

    private Node (MemberInfo dataPortion, Node nextNode)
    {
    data = dataPortion;
    next = nextNode;   
    }
}
} // end LinkedBag
