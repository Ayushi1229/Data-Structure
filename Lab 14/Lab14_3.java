public class Lab14_3 {
    public static void main(String[] args) {
        // Initialize first array and convert it to a binary tree
        int[] arr1 = {0,1,2,3,4,5,6,7,8,9};
        BTree tree1 = new BTree();
        TreeNode root1 = tree1.convertArrayToBTree(arr1, 0);
        
        // Perform preorder traversal on the first tree
        BSTTree t = new BSTTree();
        t.preOrder(root1);

        // Initialize second array and convert it to a binary tree
        int[] arr2 = {0,1,2,3,4,5,7,8,9};
        BTree tree2 = new BTree();
        TreeNode root2 = tree2.convertArrayToBTree(arr2, 0);

        // Check if the two trees are the same
        CheckSameTree c = new CheckSameTree();
        System.out.println(c.checkTree(root1, root2)); // Print the result
    }
}

class CheckSameTree {
    // Method to check if two binary trees are the same
    public boolean checkTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true; // Both trees are empty
        if (root1 == null || root2 == null) return false; // One tree is empty and the other is not

        if (root1.data != root2.data) return false; // Data mismatch

        return checkTree(root1.left, root2.left) && checkTree(root1.right, root2.right); // Recursively check left and right subtrees
    }
}

class BTree {
    // Method to convert an array to a binary tree
    public TreeNode convertArrayToBTree(int[] arr, int index) {
        if (index < arr.length) {
            TreeNode root = new TreeNode(arr[index]); // Create a new node for the current element
            root.left = convertArrayToBTree(arr, index * 2 + 1); // Recursively build the left subtree
            root.right = convertArrayToBTree(arr, index * 2 + 2); // Recursively build the right subtree
            return root;
        }
        return null; // Return null if the index is out of bounds
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BSTTree {
    // Method to perform preorder traversal on a binary tree
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " "); // Print the current node's data
            preOrder(root.left); // Recursively traverse the left subtree
            preOrder(root.right); // Recursively traverse the right subtree
        }
    }
}