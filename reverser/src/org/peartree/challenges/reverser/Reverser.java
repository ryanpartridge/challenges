package org.peartree.challenges.reverser;
/*
 * Reverser challenge
 * 
 * take a linked list and reverse it
 */
public class Reverser
{
    private Node head = null;

    public Reverser()
    {
        head = new Node();
        Node next = head;
        for (int i = 0; i < 9; ++i)
        {
            next.setNext(new Node());
            next = next.getNext();
        }
    }

    public void run()
    {
        System.out.println("Hello Reverser!");
        System.out.println("initial list:");
        printList();
        
        reverse();
        System.out.println();
        System.out.println("reversed list:");
        printList();
    }
    
    public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.println(n);
            n = n.getNext();
        }
    }
    
    public void reverse()
    {
        // this is the function you have to implement
        //
        // when done, the list should be in the reserve order
    }
    
    public static void main(String[] args)
    {
        Reverser r = new Reverser();
        r.run();
    }
}
