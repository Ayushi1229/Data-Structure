import java.util.Scanner;

class CircularQueue{
    int r;
    int f;
    int[] cq;
    int size;

    public CircularQueue(int n){
        this.r =-1;
        this.f =-1;
        this.size =n;
        cq = new int[n];
    }

    public void circularQueueInsert(int value) {
            if(r==size){
                r=-1;
            }else{
                r++;
            }
            if(f==r){
                System.out.println("Overflow");
                return;
            }
            cq[r] = value;

            if(f==-1){
                f=0;
            return;
            }
            display();
        }

    public int circularQueueDelete(){
        if(f==-1){
            System.out.println("Underflow");
            return -1;
        }
        int value =cq[f];

        cq[f]=-1;

        if(f==r){
            f=-1;
            r=-1;
            return(value);
        }else if(f==size){
            f=0;
        }else{
            f++;
        }
        display();
        return value;
    }

    public void display() {
        System.out.println("Display");
        for (int i = 0; i < size; i++) {
            System.out.print(cq[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of queue");
        int n =sc.nextInt();

        CircularQueue q = new CircularQueue(n);
        int x =1;
        while(x<4){
            System.out.println("Enter 1 for enqueue");
            System.out.println("Enter 2 for dequeue");
            System.out.println("Enter 3 for display");
            System.out.println("Enter 4 for break");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Enter an element : ");
                    int element = sc.nextInt();
                    q.circularQueueInsert(element);
                    break;

                case 2:
                    int y = q.circularQueueDelete();
                    if (y > -1) {
                        System.out.println(y + " deleted");
                    }
                    break;

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