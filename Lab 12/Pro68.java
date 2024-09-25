import java.util.*;

class Pro68 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtLast(1);
        l1.insertAtLast(2);
        l1.insertAtLast(3);
        l1.insertAtLast(4);
        l1.insertAtLast(5);
        l1.insertAtLast(6);

        System.out.println("Original list:");
        l1.display();

        System.out.println("List after swapping adjacent elements:");
        l1.swapNeighborElements();
        l1.display();
    }
}

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    Node head;

    void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    void swapNeighborElements() {
        if (head == null || head.link == null) {
            return; 
        }

        Node prev = head;
        head = prev.link; 
        Node current = head;
        Node next = null;

        while (true) {
            next = current.link; 
            current.link = prev; 
            if (next == null || next.link == null) {
                prev.link = next;
                break;
            }

            prev.link = next.link; 
            prev = next;           
            current = prev.link;   
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}
