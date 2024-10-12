public class LinkedList {
    Node head;
    class Node
    {
        int data;
        Node next;
        //constructor to initialize
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    //inserting the data at beginning of the node
    public Node insertNode(int data)
    {
        //Using constructor to create memory and value assignment
        Node new_node = new Node(data);
        //current head becomes this new_nodes next
        new_node.next = head;
        head = new_node;
        return head;
    }

    //insert at end
    public void insertEnd(int data)
    {
        Node new_node = new Node(data);
        if (head == null)
        {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
    }
    //delete method
    public void delete()
    {
        if (head == null)
        {
            System.out.println("List is empty, not possible to delete");
            return;
        }
        System.out.println("Deleted Data :: "+head.data);
        //move head to the next node
        head = head.next;
    }
    //inserting the element at nth position of the linked list
    public void insertNthPosition(int n, int data)
    {
        int size = calcSize(head);
        if (n<1 || n > size)
        {
            System.out.println("Can't Insert");
        }else
        {
            Node new_Node = new Node(data);
            //required to traverse
            Node temp = head;
            while (--n > 0)
            {
                temp = temp.next;
            }
            new_Node.next = temp.next;
            temp.next = new_Node;
        }
    }
    public int calcSize(Node node)
    {
        int size = 0;
        while (node!= null)
        {
            node = node.next;
            size++;
        }
        return size;
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
        listObj.delete ();
        listObj.delete ();
        listObj.delete ();

        listObj.display ();

        listObj.insertEnd(85);
        listObj.display();
        listObj.insertNthPosition(1,100);
        listObj.display();
    }
}
