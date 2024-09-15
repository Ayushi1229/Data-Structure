import java.util.Scanner;
class Node{
    int info;
    Node link;
    public int data;
    public Node next;
    public Node(int data){
            this.info = data;
            this.link = null;
    }
}
class LinkedList{
    public Node first = null;
    public Node head;
    public void insertAtFirst(int info){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if(first==null){
            first = newNode;
            return;
        }
        Node temp = first;
        first = newNode;
        first.link = temp;
    }
    public void insertAtLast(int info){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if(first==null){
            first = newNode;
            return;
        }
        Node last = first;
        while(last.link!=null){
            last = last.link;
        }
        last.link = newNode;
    }
    public void insertAtOrder(int info){
        Node newNode = new Node(info);
        
        if(first==null||newNode.info<=first.info){
            newNode.link=first;
            first=newNode;
            return;     
        }
        Node save=first;
        while(save.link!=null && newNode.info>=save.link.info){
            save=save.link;
        }
        newNode.link = save.link;
        save.link = newNode;

    }public void deleteAtFirst(){
        if(first==null){
            System.out.println("Empty");
            return;
        }
        else{
            first=first.link;
        }
    }
    public void deleteAtLast(int key){
        if(first==null){
            System.out.println("Empty");
            return;
        }
        Node temp = first,prev=null;
        
        if(temp.info==key){
            first=temp.link;
            return;
        }
        Node save = first;
        while(save.link!=null){
            save=save.link;
        }
        return;
    }
    public void deleteAtPosition(int key){
        if(first==null){
            System.out.println("Empty");
            return;
        }
        Node temp = first,prev=null;
        
        if(temp.info==key){
            first=temp.link;
            return;
        }
        while(temp!=null && temp.info!=key){
            prev = temp;
            temp = temp.link;
        }
        if(temp==null){
            System.out.println("Node not Found");
            return;
        }
        prev.link = temp.link;
    }
    
    public void display(){
        if(first == null){
            System.out.println("LinkedList is Empty"); 
            return;
        }
        Node temp = first;
        while(temp.link != null){
            System.out.print(temp.info + " -> ");
            temp = temp.link; 
        }
        System.out.println(temp.info); 
        }
    // // public void insert(int element) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'insert'");
    // }
}

public class Lab10_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        int x = 1;

        while(true){
            System.out.println("Enter 1 for insert at first");
            System.out.println("Enter 2 for insert at end");
            System.out.println("Enter 3 for insert at order");
            System.out.println("Enter 4 for delete at first");
            System.out.println("Enter 5 for delete at last");
            System.out.println("Enter 6 for delete at position");
            System.out.println("Enter 7 for display");
            x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Enter an element : ");
                    int element1 = sc.nextInt(); 
                    linkedList.insertAtFirst(element1); 
                    break; 

                case 2:
                    System.out.println("Enter an element : ");
                    int element2 = sc.nextInt(); 
                    linkedList.insertAtLast(element2); 
                    break;

                case 3:
                    System.out.println("Enter an element : ");
                    int element3 = sc.nextInt();
                    linkedList.insertAtOrder(element3);
                    break;

                case 4:
                    System.out.println("Enter an element : ");
                    linkedList.deleteAtFirst();
                    break;

                case 5:
                    System.out.println("Enter an element : ");
                    int element5 = sc.nextInt();
                    linkedList.deleteAtLast(element5);
                    break;

                case 6:
                    System.out.println("Enter an element :");
                    int element6 = sc.nextInt();
                    linkedList.deleteAtPosition(element6);
                    break;
                case 7:
                    linkedList.display();
                    break;

                default:
                    break;
            }
        }
    }
}
