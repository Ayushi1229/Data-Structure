import java.util.LinkedList;
import java.util.Queue;

public class Pre_Post_Create_Tree {

    public static void main(String[] args) {
        int[] pre = { 5, 3, 2, 1, 4, 8, 7 };
        int[] post = { 1, 2, 4, 3, 7, 8, 5 };

        ConstructTree t = new ConstructTree();

        Node root = t.PrePostConstruct(pre, post);

        System.out.println("Tree Structure:");
        t.displayTree(root);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class ConstructTree {
    int preIndex = 0;
    int postIndex = 0;

    public Node PrePostConstruct(int[] pre, int[] post) {
        Node root = new Node(pre[preIndex++]);

        if (root.data != post[postIndex]) {
            root.left = PrePostConstruct(pre, post);
        }

        if (root.data != post[postIndex]) {
            root.right = PrePostConstruct(pre, post);
        }

        postIndex++;

        return root;
    }

    public void displayTree(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                if (currentNode != null) {
                    System.out.print(currentNode.data + " ");
                    if (currentNode.left != null) {
                        queue.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.add(currentNode.right);
                    }
                }
            }
            System.out.println(); 
        }
    }
}
