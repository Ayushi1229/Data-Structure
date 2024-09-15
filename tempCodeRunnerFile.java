class DNode {
    int data; // Data stored in the node
    DNode lptr; // Pointer to the previous node
    DNode rptr; // Pointer to the next node

    public DNode() {
        this.data = 0;
        this.lptr = this.rptr = null; // Initialize node with default values
    }

    public DNode(int data) {
        this(); // Constructor chaining to initialize node
        this.data = data;
    }
}
class DoublyLinkedList {
    DNode left; // Head of the doubly linked list
    DNode right;
public void deleteAlternateNode(){
        if(left == null || left.rptr == null){
            return; // If list is empty or has only one node, no alteration needed
        }
        if(left.rptr.rptr == null){
            left.rptr = null;
            right = left;
            return; // If there are exactly two nodes, remove the second node
        }
    
        DNode temp = left;
    
        // Traverse the list and remove every alternate node
        while(temp.rptr != null){
            temp.rptr = temp.rptr.rptr; // Skip the next node to delete it
            if(temp.rptr == null) break; // If end of list is reached, break the loop
            temp.rptr.lptr = temp; // Update previous pointer of the new next node
            temp = temp.rptr; // Move to the next node
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        int element;
        dll.deleteAlternateNode();
}