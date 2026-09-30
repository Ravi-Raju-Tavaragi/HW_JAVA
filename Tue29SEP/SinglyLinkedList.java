package Tue29SEP;

public class SinglyLinkedList
{
    static void printList(Node node)
    {
        System.out.print("head-->");

        while(node != null)
        {
            System.out.print(node.data + "-->");
            node = node.next;
        }

        System.out.print("null");
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


    public static Node insertAtEnd(int value, Node currenthead)
    {
        Node lastNode = new Node();
        lastNode.data = value;
        lastNode.next = null;

        if(currenthead == null)
        {
            return lastNode;
        }

        else
        {

        Node temp = currenthead;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = lastNode;
        

        return currenthead;
        }

    }


    static Node insertAtMidle(int value, Node currenthead)
    {
        Node midNode = new Node();
        midNode.data = value;
        midNode.next = null;

        Node temp = currenthead;
        midNode.next = temp.next;
        temp.next = midNode;

        while (temp != null) 
        {
            if(temp.data == 100)
            {
                break;
                
            }
        }
        return currenthead;


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
        
        System.out.println("\n Insert at End node");
       
        head = insertAtEnd(300, head);
        printList(head);

        System.out.println("\n Insert at Mid node");
        head = insertAtMidle(111, head);
        printList(head);


    }
    
}
