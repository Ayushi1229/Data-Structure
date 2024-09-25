import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Lab11_3 {
    public static Node removeDuplicates(Node head) {
        Node current = head;

        while (current != null) {
            Node runner = current;

            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node dummy = new Node(0);
        Node prev = dummy;

        System.out.println("Enter elements of linked list\nEnter -1 for break");
        int x = 0;

        while (true) {
            x = sc.nextInt();
            if (x == -1) break;
            Node curr = new Node(x);
            prev.next = curr;
            prev = curr;
        }

        Node head = dummy.next;
        Node temp = head;

        System.out.print("Original List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        head = removeDuplicates(head);

        temp = head;

        System.out.print("\nModified List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }
}