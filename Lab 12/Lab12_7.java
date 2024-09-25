import java.util.Scanner;

public class Lab12_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        System.out.println("Enter elements of linked list:");
        System.out.println("---------- Enter -1 to stop ----------");

        int element;

        while (true) {
            element = sc.nextInt();
            if (element == -1) break;
            ll.insert(element);
        }

        System.out.println();
        System.out.println("---------- Original LinkedList ----------");
        ll.display();

        RemoveDuplicate rd = new RemoveDuplicate();
        rd.removeDuplicate(ll);
        
        System.out.println();
        System.out.println("----------- After deleting duplicates -----------");
        ll.display();

        sc.close();
    }
}

class RemoveDuplicate {
    public void removeDuplicate(LinkedList ll) {
        Node current = ll.head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
