import java.util.Scanner;

public class Pro66 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        private Node head;

        public void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node current = head;
            System.out.print("Linked List elements: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public void swapKthNodes(int k) {
            if (head == null || k <= 0) {
                System.out.println("Invalid operation");
                return;
            }

            int length = 0;
            Node temp = head;
            while (temp != null) {
                length++;
                temp = temp.next;
            }

            if (k > length) {
                System.out.println("K is larger than the length of the list");
                return;
            }

            Node kthFromStartPrev = null;
            Node kthFromStart = head;
            for (int i = 1; i < k; i++) {
                kthFromStartPrev = kthFromStart;
                kthFromStart = kthFromStart.next;
            }

            Node kthFromEndPrev = null;
            Node kthFromEnd = head;
            for (int i = 1; i < length - k + 1; i++) {
                kthFromEndPrev = kthFromEnd;
                kthFromEnd = kthFromEnd.next;
            }

            if (kthFromStart == kthFromEnd) {
                System.out.println("The nodes to be swapped are the same.");
                return;
            }

            if (kthFromStartPrev != null) {
                kthFromStartPrev.next = kthFromEnd;
            } else {
                head = kthFromEnd;
            }

            if (kthFromEndPrev != null) {
                kthFromEndPrev.next = kthFromStart;
            } else {
                head = kthFromStart;
            }

            Node tempNode = kthFromEnd.next;
            kthFromEnd.next = kthFromStart.next;
            kthFromStart.next = tempNode;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("Enter the number of nodes in the linked list:");
        int numNodes = scanner.nextInt();
        System.out.println("Enter the values for the nodes of the linked list:");
        for (int i = 0; i < numNodes; i++) {
            int value = scanner.nextInt();
            list.addNode(value);
        }

        System.out.println("Original linked list:");
        list.display();

        System.out.println("Enter the value of K:");
        int k = scanner.nextInt();

        list.swapKthNodes(k);

        System.out.println("Linked list after swapping Kth nodes:");
        list.display();

        scanner.close();
    }
}