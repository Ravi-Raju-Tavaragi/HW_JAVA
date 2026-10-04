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



    public static void testInserAtStart()
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

    public static void testInsertAtEnd()
    {
        printList(null);

        System.out.println("\n Insert at End single node");
        Node head = null;
        head = insertAtEnd(100, head);
        printList(head);
        
        System.out.println("\n Insert at End multiple node");
        head = insertAtEnd(200, head);
        head = insertAtEnd(300, head);
        head = insertAtEnd(400, head);
        head = insertAtEnd(500, head);
        printList(head);

        System.out.println("\n Insert at End after inserting many node");   
        head = insertAtEnd(600, head);
        printList(head);

    }


    public static void testInsertAfterKey()
    {
        printList(null);

        System.out.println("\n Insert after head node");
        Node head = null;
        insertAfterKey(head, 100, 20);
        printList(head);

        System.out.println("\n Insert at start multiple node");
        head = insertAtStart(200, head);
        head = insertAtStart(300, head);
        printList(head);
        
        System.out.println("\n Insert at mid multiple node");
        insertAfterKey(head, 200, 20);
        printList(head);
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


   public static Node insertAtEnd(int value, Node head)
   {
    //create one new Node Name it as lastNode
    Node lastNode = new Node();
    lastNode.data = value;
    lastNode.next = null;

    //if heap is empty or there is no node
    if(head == null)
    {
        return lastNode;
    }

    //if there is one or more node and take one temporvary Node to traval throw node untill our node stop behind null
    else
    {
        Node curentLastNode = head;

        while (curentLastNode.next != null) 
        {
            curentLastNode = curentLastNode.next;     
        }

        curentLastNode.next = lastNode;

        return head;
    }
    
   }

   public static void insertAfterKey(Node head, int key, int value)
   {
    Node newNode = new Node();
    newNode.data = value;
    newNode.next = null;
    if(head == null)
    {
        return ;
    }

    if(head.data == key)
    {
        head.next = newNode;
        return ;
    }

    Node keyNode = head;
    while(keyNode != null && keyNode.data != key)
    {
        keyNode = keyNode.next;
    }

    if(keyNode == null)
    {
        return ;
    }
    else
    {
        newNode.next = keyNode.next;
        keyNode.next = newNode;
    }

   }
     


    public static void main(String[] args) 
    {
        testInserAtStart();//calling method throuhg main
        //testInsertAtEnd();
        testInsertAfterKey();
    }
    
}
