class BSTNode
{
    int data;
    BSTNode left,right;
    BSTNode(int value)
    {
        data = value;
        left=right=null;
    }
}

public class BinarySearchTree {
    Node root;
    BinarySearchTree()
    {
        root = null;
    }
    public void insert(int item)
    {
        root =insertNode(root,item); //calling inserNode() method
    }
    public Node insertNode(Node root,int data)
    {
        if (root == null)
        {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
        {
            root.left = insertNode(root.left,data);
        }else if (data>root.data)
        {
            root.right=insertNode(root.right,data);
        }
        return root;
    }

    //searching a node in the tree
    public Node searchNode(Node root,int data)
    {
        if (root==null)
        {
            return null;
        }
        if (root.data == data)
            return root;
        else if (data < root.data) {
            return searchNode(root.left,data);
        }else
        {
            return searchNode(root.right,data);
        }
    }
    //preorder Traversal of binary tree
    public static void preorder(Node ptr)
    {
        if(ptr==null)
            return ;
        System.out.print(ptr.data+" ");
        preorder(ptr.left);
        preorder(ptr.right);
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(30);
        bst.insert(50);
        bst.insert(55);
        bst.insert(45);
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(12);

        preorder(bst.root);
        Node node=bst.searchNode(bst.root,45);
        if(node!=null)
            System.out.println("\nElement "+node.data+" is found in binary  tree");
        else
            System.out.println("Element is not found in binary tree");
    }
}
