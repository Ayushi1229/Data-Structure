import java.util.Scanner;
class CNode {
    int data;
    CNode next;
    public CNode() {
        this.data = 0;
        this.next = null; 
    }

    public CNode(int data) {
        this(); // Constructor chaining to initialize node
        this.data = data;
    }

    public CNode(int data, CNode next) {
        this.data = data;
        this.next = next; // Constructor to initialize node with specific data and next pointer
    }
}

public class CircularLinkedList {
    CNode first;
    CNode last;

    public CircularLinkedList(){
        first = last = null;
    }

    public void insertAtFirst(int value){
        CNode node = new CNode(value);
        if(first==null){
            first = last = node;
        }
        else
        {
            node.next = first;
            last.next = node;
            first = node;
        }
    }

    public void insertAtLast(int value){
        CNode node = new CNode(value);
        if(first == null){
            first = last = node;
        }
        else
        {
            node.next = first;
            last.next = node;
            last = node;
        }
    }

    public void deleteAtPosition(int position){
        if(first == null){
            System.out.println("Linked list is empty");
            return;
        }
        if(position == 1){
            if(first==last){
                first = last = null;
            }
            else{
                first = first.next;
                last.next = first;
            }
        }
        int count =1;
        CNode temp =first.next;
        CNode prev = first;
        while(temp!=first){
            count++;
            if(count==position){
                prev.next = temp.next;
                if(temp==last){
                    last = prev;
                }
                return;
            }
            prev = temp;
            temp =temp.next;
        }
    }
    
    public void display(){
        CNode temp = first;
        while (temp.next != first) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data); 
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int x = 1;
        int value;
        
        CircularLinkedList cll = new CircularLinkedList();
        
        while(x<5){
            System.out.println("Enter 1 for insert at first");
            System.out.println("Enter 2 for insert at last");
            System.out.println("Enter 3 for delete at position");
            System.out.println("Enter 4 for display");
            System.out.println("Enter 5 for break");
        
        x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("---------- Insert at First ----------");
                System.out.println("Enter an element : ");
                value = sc.nextInt();
                cll.insertAtFirst(value);
                break;
        
            case 2:
                System.out.println("---------- Insert at Last ----------");
                System.out.println("Enter an element : ");
                value = sc.nextInt();
                cll.insertAtLast(value); 
                break;

            case 3:
                System.out.println("---------- Delete at Position ----------");
                System.out.println("Enter a position : ");
                value = sc.nextInt();
                cll.deleteAtPosition(value);
                break;

            case 4:
                System.out.println("---------- Display ----------");
                cll.display(); 
                break;
            
            default:
                break;
        }
    }
        sc.close();
}
}