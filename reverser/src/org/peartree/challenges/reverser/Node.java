package org.peartree.challenges.reverser;
/*
 * Node class
 * 
 * This class is used for a linked list.
 * It has an ID and a next Node pointer.
 */
public class Node
{
    private int id = 0;
    private Node next = null;
    
    private static int nextId = -1;
    
    public Node()
    {
        id = ++nextId;
    }
    
    public void setNext(Node next)
    {
        this.next = next;
    }
    
    public Node getNext()
    {
        return this.next;
    }
    
    public String toString()
    {
        return "Node ID: " + id;
    }
}
