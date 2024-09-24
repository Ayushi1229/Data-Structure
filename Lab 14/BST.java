import java.util.*;

class Node{
    int key;
    Node left,right;

    public Node(int data) {
        key = data;
        left = right = null;
    }
}
public class BST {
    Node root;

    public BST(){
        root=null;
    }

    void insert(int data){
        root=insertRecord(root,data);
    }
    public Node insertRecord(Node root, int data){
        if(root == null){
            root= new Node(data);
            return root;
        }
        if(data<root.key){
            root.left=insertRecord(root.left, data);
        }
        else if(data>root.key){
            root.right=insertRecord(root.right, data);
        }
        return root;
    }


    public boolean search(int data){
        return searchRecord(root,data);        
    }
    boolean searchRecord(Node root,int data){
        if(root==null){
            return false;
        }
        else if(data==root.key){
            return true;
        }
        else if(data>root.key){
            return searchRecord(root.right, data);
        }
        else{
            return searchRecord(root.left, data);
        }
    }


    void delete(int data){
        root = deleteRec(root,data);
    }
    Node deleteRec(Node root, int data){
        if(root==null){
            return root;
        }
        if(data<root.key){
            root.left = deleteRec(root.left,data);
        }
        else if(data>root.key){
            root.right = deleteRec(root.right, data);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            root.key=minValue(root.right);
            root.right=deleteRec(root.right,root.key);
        }
        return root;

    }
    int minValue(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

            void inorder() {
        inorderRec(root);
            }

            void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
            }
        }
    
    public static void main(String[] args){
        BST bst = new BST();
        Scanner sc = new Scanner(System.in);
        int choice, value;
        while(true){
            System.out.println("Binary Search Tree Operations:");
            System.out.println("Enter 1 for insert a node");
            System.out.println("Enter 2 for search a node");
            System.out.println("Enter 3 for delete:");
            System.out.println("Enter 4 for display");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    bst.insert(value);
                    System.out.println(" Insert thay gayo");
                    break;
                case 2:
                    System.out.println("Enter value to search:");
                    value = sc.nextInt();
                    if(bst.search(value)){
                        System.out.println("Node madi gyo");
                    }
                    else{
                        System.out.println("Node nathi");
                    }
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    bst.delete(value);
                    System.out.println("Node delete thay gayo");
                    break;
                case 4:
                    System.out.println("Inorder Traversal of the tree");
                    bst.inorder();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("bar nikadi gayo ");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("choice ma bhul che pachi nakh");
        }
    }
}
}