import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
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

    void delete(int data) {
        root = deleteRec(root, data);
    }

    Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    boolean search(int data) {
        return searchRec(root, data);
    }

    boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }

        if (data < root.data) {
            return searchRec(root.left, data);
        }

        return searchRec(root.right, data);
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void preorder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preorder'");
    }

    public void postorder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postorder'");
    }
}

public class BSTMenuDriven {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        while (true) {
            System.out.println("\nBinary Search Tree Operations:");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Search for a node");
            System.out.println("4. Display Inorder Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();
                    bst.insert(value);
                    System.out.println(" insert thay gayo");
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    bst.delete(value);
                    System.out.println("Node delete thay gayo");
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    value = scanner.nextInt();
                    if (bst.search(value)) {
                        System.out.println("Node madi gayo");
                    } else {
                        System.out.println("Node nathi");
                    }
                    break;
                case 4:
                    System.out.println("Inorder Traversal of the tree");
                    bst.inorder();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("bar nikadi gayo ");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("choice ma dhule che pachi nakh");
            }
        }
    }
}