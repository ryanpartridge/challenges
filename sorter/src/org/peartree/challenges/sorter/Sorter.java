package org.peartree.challenges.sorter;
/*
 * Reverser challenge
 * 
 * take a linked list and reverse it
 */
public class Sorter
{
    int[] values = new int[10];
    
    public Sorter()
    {
        for (int i = 0; i < values.length; ++i)
        {
            values[i] = i;
        }
    }

    public void run()
    {
        System.out.println("Hello Sorter!");
        System.out.println("initial array:");
        printArray();
        
        sortArray();
        System.out.println();
        System.out.println("reversed array:");
        printArray();
    }
    
    public void printArray()
    {
        for (int i = 0; i < values.length; ++i)
        {
            System.out.println("Value: " + values[i]);
        }
    }
    
    public void sortArray()
    {
        // this is the function you have to implement
        //
        // when done, the list should be in the reserve order
    }
    
    public static void main(String[] args)
    {
        Sorter s = new Sorter();
        s.run();
    }
}
