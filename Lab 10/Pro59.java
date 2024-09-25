import java.util.*;


public class Pro59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        System.out.println("Enter first LinkedList length");
        int length1 = sc.nextInt();
        System.out.println("Enter second LinkedList length");
        int length2 = sc.nextInt();
        for (int i = 0; i < length1; i++) {

            System.out.println("Enter digit");
            int a = sc.nextInt();
            l1.push(a);
        }
        for (int i = 0; i < length2; i++) {

            System.out.println("Enter digit");
            int a = sc.nextInt();
            l2.push(a);
        }
        if (l1.compare(l2)) {
            System.out.println("Both linked lists are same");
        } else {
            System.out.println("Both linked lists are not same");
        }
    }
}

class Node {
    int info;
    Node link;

    Node(int data) {
        this.info = data;
    }
}

class LinkedList {
    Node head;
    int count = 0;

    void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.link = head;
            head = newNode;
        }
        count++;
    }

    boolean compare(LinkedList l2) {
        if (this.count != l2.count) {
            return false;
        }
        Node temp1 = this.head;
        Node temp2 = l2.head;
        while (temp1 != null) {
            if (temp1.info != temp2.info) {
                return false;
            }
            temp1 = temp1.link;
            temp2 = temp2.link;
        }
        return true;
    }
}