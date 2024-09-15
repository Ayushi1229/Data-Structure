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

	public Node treedisp(int index, int a[]) {
		if (index >= a.length) {
			return null;
		}
		Node newNode = new Node(a[index]);
		newNode.left = treedisp(index * 2 + 1, a);
		newNode.right = treedisp(index * 2 + 2, a);
		return newNode;
	}

	public void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.key + " "); // Use root.key instead of root.data
		preorder(root.left);
		preorder(root.right);
	}

	public void postorder(Node root) {
		if (root == null) {
			return;
		}
		preorder(root.left);
		preorder(root.right);
		System.out.print(root.key + " "); // Use root.key instead of root.data
	}

	public void inorder(Node root) {
		if (root == null) {
			return;
		}
		preorder(root.left);
		System.out.print(root.key + " "); // Use root.key instead of root.data
		preorder(root.right);
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
		Tree.Node root = t.treedisp(0, a); // Capture the root node

		System.out.println("Pre-order traversal of the tree:");
		t.preorder(root);	 // Call preorder on the captured root node

	
		System.out.println("\nPost-order traversal of the tree:");
		t.postorder(root); // Call preorder on the captured root node

		System.out.println("\nin-order traversal of the tree:");
		t.inorder(root); // Call preorder on the captured root node


	}
}