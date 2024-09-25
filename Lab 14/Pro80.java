public class Pro80 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        Tree t1 = new Tree(a.length);
        Node new1;
        new1 = t1.insert(0, a);
        t1.symmetric(new1);
        t1.check();
    }
}

class Node {
    int data;
    Node lptr;
    Node rptr;

    Node(int data) {
        this.data = data;
        lptr = null;
        rptr = null;
    }

}

class Tree {
    Node save;
    int count1 = 0;
    int[] array;
    Node root;
    Node frist;
    int i = 0;

    Tree(int size) {
        array = new int[size];
    }

    Node insert(int index, int[] a) {
        Node n1;

        if (index >= a.length) {
            if (i == 0) {
                frist = root;
                i++;
            }
            return n1 = null;
        } else {
            n1 = new Node(a[index]);
            n1.lptr = insert(index * 2 + 1, a);
            n1.rptr = insert(index * 2 + 2, a);
        }
        save = n1;
        return n1;
    }

    void symmetric(Node save) {
        if (save.lptr.data == save.rptr.data) {
            symmetric1(save.lptr, save.rptr, save.lptr, save.rptr);
        } else {
            System.out.println("tree is not symmetric");
            System.exit(0);
        }

    }

    void symmetric1(Node left, Node right, Node left1, Node right1) {
        if (left == null || right == null || left1 == null || right1 == null) {
            return;
        } else if (left.data == right.data && left1.data == right1.data) {
            symmetric1(left.lptr, right.rptr, left1.rptr, right1.lptr);
        } else {
            count1++;

        }
    }

    void check() {
        if (count1 == 0) {
            System.out.println("Tree is  symmetric");
        } else {
            System.out.println("Tree is not symmetric");

        }
    }

}
