class Pro58 {
    public static void main(String[] args) {
        
        LinkedList.push(2);
        LinkedList.push(3);
        LinkedList.push(4);
        LinkedList.countNode();  // Displays the nodes and the total count
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
    static Node head;

    static void push(int n1) {
        Node n = new Node(n1);
        if (head == null) {
            head = n;
            n.link = head;  
        } else {
            Node last = head;
            while (last.link != head) { 
                last = last.link;
            }
            last.link = n;  
            n.link = head;  }
    }

   static  void countNode() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        int count = 0;
        do {
            System.out.println("Node data: " + current.data);
            count++;
            current = current.link;
        } while (current != head);  
        System.out.println("Total number of nodes: " + count);
    }
}
