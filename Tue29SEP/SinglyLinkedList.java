package Tue29SEP;

public class SinglyLinkedList
{
    static void printList(Node head)
    {
        Node monkey = head;
        System.out.print("head-->");

        while (monkey != null)
        {
            System.out.print(monkey.data +"-->");
            monkey = monkey.next;
        }
        System.err.print("null");
    }




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

       /*if(currenthead != null)
        newNode = currenthead;
       return newNode;*/


    }


    public static void main(String[] args) 
    {
        printList(null);

        System.out.println("\n Insert at start single node");
        Node head = null;
        //Function invocation
        head = insertAtStart(100, head);
        printList(head);
        
        System.out.println("\n Insert at start multiple node");
        head = insertAtStart(200, head);
        head = insertAtStart(300, head);
        printList(head);
        
    }
    
}
