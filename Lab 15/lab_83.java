import java.util.Scanner;
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}
class BinarySearchTree {
    Node root;
    public BinarySearchTree() {
        root = null;
    }

   

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
		Node largest(Node root)
		{
			if(root.right==null)
			{
				return root;
			}
			else{
				return largest(root.right);
			}
		}
		Node smallest(Node root)
		{
			if(root.left==null)
			{
				return root;
			}
			else{
				return smallest(root.left);
			}
		}
}

class lab_83  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int n=sc.nextInt();
	    BinarySearchTree bs=new BinarySearchTree();
		int i=0;
		while(i<=n)
		{
			System.out.println("Enter a value to insert:");
			int value=sc.nextInt();
             bs.root=bs.insertRec(bs.root,value);
            i++;
		}
		Node large=bs.largest(bs.root);
		Node small=bs.smallest(bs.root);
		System.out.println("large is"+large.data);
		System.out.println("small is"+small.data);

        
        
	}

	
}