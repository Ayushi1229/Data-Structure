//Lab10_3
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    class CircularLinkedList {
        Node head;
    
        public CircularLinkedList() {
            this.head = null;
        }
    
        // Method to add a new node at the end of the list
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                head.next = head; // Circular reference
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = head; // Circular reference
            }
        }
    
        // Method to count the number of nodes in the circular linked list
        public int countNodes() {
            if (head == null) {
                return 0;
            }
            
            Node temp = head;
            int count = 1; // Start count with head node
            while (temp.next != head) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    
        public static void main(String[] args) {
            CircularLinkedList list = new CircularLinkedList();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
    
            System.out.println("Number of nodes in the circular linked list: " + list.countNodes());
        }
    }
