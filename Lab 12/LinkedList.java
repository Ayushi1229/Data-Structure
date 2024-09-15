//copy a linkedlist
import java.util.Scanner;
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public class LinkedList {
        Node head;
    
        // Method to append a new node to the list
        public void append(int data) {
            if (head == null) {
                head = new Node(data);
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    
        // Method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    
        // Method to copy the linked list
        public LinkedList copyList() {
            if (head == null) {
                return null;
            }
    
            Node current = head;
            LinkedList newList = new LinkedList();
            newList.head = new Node(current.data);
            Node newCurrent = newList.head;
    
            while (current.next != null) {
                current = current.next;
                newCurrent.next = new Node(current.data);
                newCurrent = newCurrent.next;
            }
    
            return newList;
        }
    
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.append(1);
            list.append(2);
            list.append(3);
            list.append(4);
    
            System.out.println("Original list:");
            list.printList();
    
            LinkedList copiedList = list.copyList();
            System.out.println("Copied list:");
            copiedList.printList();
        }
    }
