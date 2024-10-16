public class LinkedList {
    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int x)
        {
            data = x;
            next = null;
        }
    }
    //inserting data into the linked list
    public Node insertNode(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
        return head;
    }
    //delete the node
    public void delete()
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Deleted data :: "+head.data);
        head = head.next;
    }
    //delete last
    public void deleteLast()
    {
        if (head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null)
        {
            System.out.println("Deleted data "+head.data);
            head = head.next;
        }
        Node previous = null;
        Node temp = head;

        while (temp.next != null)
        {
            previous = temp;
            temp = temp.next;
        }
        System.out.println("Deleted data :: "+temp.data);
        previous.next = null;
    }
    //insert end
    public void insertEnd(int data)
    {
        Node new_node = new Node(data);
        if (head == null)
        {
            head = new_node;
            System.out.println("Inserted :: "+new_node.data);
            return;
        }

        //need to be traverse the linked list
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
        System.out.println(new_node.data + " inserted");
    }


    //reverse linked list
    public void reverseLinkedList()
    {
        Node temp = head;
        Node previous = null,current = null;
        while (temp != null)
        {
            current = temp;
            temp = temp.next;

            //reverse the link
            current.next = previous;
            previous = current;
            head = current;
        }
    }
    //disply method
    public void display()
    {
        Node node = head;
        //as linked list will end when node reaches Null
        while (node!= null)
        {
            System.out.print(node.data+" , ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList listObj = new LinkedList ();

        listObj.insertNode (25);
        listObj.insertNode (20);
        listObj.insertNode (15);
        listObj.insertNode (10);
        listObj.insertNode (5);

        listObj.display ();
        listObj.reverseLinkedList();
        listObj.display();
        /*listObj.deleteLast();
        listObj.display ();
        listObj.delete ();
        listObj.delete ();
        listObj.delete ();

        listObj.display ();

        listObj.insertEnd(85);
        listObj.display();*/
        /*listObj.insertNthPosition(1,100);
        listObj.display();*/
    }
}
