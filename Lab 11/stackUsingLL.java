import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class stackUsingLL {
    public Node top = null;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed into the stack");
    }

    public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int poppedData = top.data;
            top = top.next;
            return poppedData;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp!=null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        stackUsingLL stack = new stackUsingLL();
        while (true) {
            System.out.println("Menu");
            System.out.println("Enter 1 for push");
            System.out.println("Enter 2 for pop");
            System.out.println("Enter 3 for peep");
            System.out.println("Enter 4 for display");
            System.out.println("Enter 5 for exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value to be pushed");
                    int value = sc.nextInt();
                    stack.push(value);                    
                    break;
                case 2:
                    System.out.println("Popped Value : "+ stack.pop());
                    break;
                case 3:
                    System.out.println("Peeked Value : "+ stack.peek());
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Completed");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");    
            }
        }
    }
}
