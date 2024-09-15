import java.util.Scanner;

class Queue{
    Node front;
    Node rear;

    public Queue(){
        front = null;
        rear = null;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front==null){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;        
    }

    public int dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return -1;
        }
        int y = front.data;
        if(front.next == null){
            front=rear=null;
        }
        else{
            front=front.next;
        }
        return y;
    }
    public void display(){
        Node temp = front;
        while (temp!=rear) {
            System.out.println(temp.data + " : ");
            temp = temp.next;
        }
        System.out.println(temp.data);
        System.out.println();
    }
}

public class queueUsingLL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 1;

        Queue q = new Queue();

        while (true) {
            System.out.println("Enter 1 for insert");
            System.out.println("Enter 2 for delete");
            System.out.println("Enter 3 for display");
            System.out.println("Enter 4 for break");
        
            x =sc.nextInt();

            switch(x){
                case 1:
                System.out.println("Enter an element:");
                int element = sc.nextInt();
                q.enqueue(element);
                break;

                case 2:
                int y = q.dequeue();
                if(y>-1){
                    System.out.println(y+" is deleted");
                }
                break;

                case 3:
                    q.display();
                    break;
            
                default:
                sc.close();
                    break;
            }
        }
    }
}
