/*Stacks using linked lists(not complete)*/
package first ;

import java.util.Scanner ;



class Llist
{
    Node head ;
    
    static class Node
    {
        int data ;
        Node next ;
        
        Node (int d)
        {
            data = d ;
            next = null ;
        }    
    }
    
    
    void create (Node head , int x)
    {
        head = new Node (x) ;
    }
    
    
    void append (Node head , int x)
    {
        if (head == null) create (head , x) ;
        else append (head.next , x) ;
    }
    
    
    void delete (Node head)
    {
        if (head == null)
        {
            System.out.println ("Linked list Empty.") ;
        }
        else
        {
            System.out.println (head.data + " Deleted.") ;
            head = head.next ;
        }
    }
    
    
    void display (Node head)
    {
        if(head != null)
        {
            System.out.println (head.data) ;
            display (head.next) ;
        }
    }
}



public class First
{
    public static void menu ()
    {
        System.out.print("1. Apend\n2. Delete\n3. Display\n4. Exit\nEnter choice: ") ;
    }
    
    
    public static void main(String[] args)
    {
        Llist n = new Llist () ;
        int x ;
        Scanner obj=new Scanner(System.in) ;
        
        while (true)
        {
            First.menu();
            x=obj.nextInt() ;
            
            System.out.println();
            
            switch (x)
            {
                case 1:
                    System.out.println ("Enter number: ") ;
                    x=obj.nextInt() ;
                    n.append (n.head , x) ;
                    break;
                
                case 2:
                    n.delete (n.head) ;
                    break;
                
                case 3:
                    n.display(n.head) ;
                    break ;
                
                case 4:
                    return ;
                    
                default:
                    System.out.println ("Wrong input. Try again\n") ;
            }
        }
        
    }
}