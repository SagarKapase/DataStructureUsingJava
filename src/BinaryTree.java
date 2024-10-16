class Node
{
    Node left,right;
    int data;
    Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}
public class BinaryTree {
//root of binary tree
    Node root;
    BinaryTree()
    {
        root = null;
    }
    static void preorder(Node ptr)
    {
        if (ptr == null)
        {
            return;
        }
        System.out.print(ptr.data+" ");
        preorder(ptr.left);
        preorder(ptr.right);
    }
    static void inorder(Node ptr)
    {
        if (ptr == null)
        {
            return;
        }
        inorder(ptr.left);
        System.out.print(ptr.data+" ");
        inorder(ptr.right);
    }
    static void postorder(Node ptr)
    {
        if (ptr == null)
        {
            return;
        }
        postorder(ptr.left);
        postorder(ptr.right);
        System.out.print(ptr.data+" ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("Preorder traversal");
        preorder(tree.root);
        System.out.println("\nInorder traversal");
        inorder(tree.root);
        System.out.println("\nPostorder traversal");
        postorder(tree.root);
    }
}
