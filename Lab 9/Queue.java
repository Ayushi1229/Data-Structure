import java.util.Scanner;

class Queue {
    int r;
    int f;
    int[] q;
    int size;

    public Queue(int n){
        this.r = -1;
        this.f = -1;
        this.size = n;
        q = new int[n];
    }

    public void enqueue(int value){
        if(r>=size){
            System.out.println("Queue overflow");
            return;
        }
        r++;
        q[r]=value;
        if(f==-1){
            f=0;
        }
        System.out.println("Element added");
        display();
    }

    public int dequeue(){
        if(f==-1){
            System.out.println("Queue Overflow");
            return -1;
        }
        int value = q[f];
        if(f==r){
            f=-1;
            r=-1;
        }else{
            f++;
        }
        display();
        return value;
    }

    public void display(){
        if(f==-1 || r==-1){
            System.out.println("Queue empty");
            return;
        }
        System.out.println("Display");
        for(int i=f;i<=r;i++){
            System.out.println(q[i]+"-");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of queue");
        int n =sc.nextInt();

        Queue q = new Queue(n);
        int x =1;
        while(x<4){
            System.out.println("Enter 1 for enqueue");
            System.out.println("Enter 2 for dequeue");
            System.out.println("Enter 3 for display");
            System.out.println("Enter 4 for break");
            x = sc.nextInt();
            switch (x) {
                case 1:
                System.out.println("Enter an element");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;
                case 2:
                int y = q.dequeue();
                if(y>-1){
                    System.out.println(y+"deleted");
                    break;
                }
                case 3:
                q.display();
                break;

                default:
                    break;
            }
        }
        sc.close();
    }
}
