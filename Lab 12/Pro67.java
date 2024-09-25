import java.util.Scanner;

public class Pro67{

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


        private int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }


        public void insertGCDNodes() {
            if (head == null || head.next == null) {
                return;
            }

            Node current = head;

            while (current != null && current.next != null) {
                int gcdValue = gcd(current.data, current.next.data);
                Node newNode = new Node(gcdValue);
                newNode.next = current.next;
                current.next = newNode;
                current = newNode.next; // Move to the next original node
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

        list.insertGCDNodes();

        System.out.println("Linked list after inserting GCD nodes:");
        list.display();

        scanner.close();
    }
}