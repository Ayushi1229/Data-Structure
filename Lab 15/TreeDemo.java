import java.util.Scanner;
class Tree {
	class Node {
		int key;
		Node left;
		Node right;

		public Node(int data) {
			this.key = data;
			this.left = null;
			this.right = null;
		}
	}
	public Node root = null;

	public Node treedisp(int index, int a[]) {
		if (index >= a.length) {
			return null;
		}
		Node newNode = new Node(a[index]);
		if(newNode.key == -1){
            return null;
        }

		newNode.left = treedisp(index * 2 + 1, a);
		newNode.right = treedisp(index * 2 + 2, a);
		return newNode;
	}

	public void preorder(Node root) {
		if (root == null) {
			System.out.println("empty tree");
			return;
		}
		System.out.println(root.key + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public void postorder(Node root) {
		if (root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key + " "); 
	}

	public void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.key + " "); 
		inorder(root.right);
	}

}

class TreeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter a[" + i + "]:");
			a[i] = sc.nextInt();
		}
		Tree t = new Tree();
		Tree.Node root = t.treedisp(0, a); 

		System.out.println("Pre-order traversal of the tree:");
		t.preorder(t.root);	 

	
		System.out.println("\nPost-order traversal of the tree:");
		t.postorder(t.root); 

		System.out.println("\nin-order traversal of the tree:");
		t.inorder(t.root); 
	}
}