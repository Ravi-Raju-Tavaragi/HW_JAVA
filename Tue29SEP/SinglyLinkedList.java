package Tue29SEP;

public class SinglyLinkedList
{
    public static Node insertAtStart(int value, Node currenthead)
    {
       Node newNode = new Node();//creation of new node and set the values
       newNode.data = value;
       newNode.next = null;

       //1.Test case head is null or list empty
       if(currenthead == null)
       {
        return newNode;
       }
       //2.List is not empty there are more nodes
       else
       {
        newNode.next = currenthead;
        return newNode;
       }


    }


    public static void main(String[] args) 
    {
        Node head = null;
        //Function invocation
        head = insertAtStart(100, head);
        
    }
    
}
