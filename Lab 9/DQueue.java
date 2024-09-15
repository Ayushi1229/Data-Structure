import java.util.Scanner;

class DQueue{
    int r;
    int f;
    int[] dq;
    int size;

    public DQueue(int n){
        this.r = -1;
        this.f = -1;
        this.size = n;
        dq = new int[n];
    }

    public void insertAtFront(int value){
        if(f==0){
            System.out.println("Overflow");
            return;
        }
        if(f==-1){
            f=0;
            r=0;
        }
        else{
            f--;
        }
        dq[f] =value;
        return;
    }

    public void insertAtRear(int value){
        if(r>=size){
            System.out.println("Queue overflow");
            return;
        }
        r++;
        dq[r]=value;
        if(f==-1){
            f=0;
        }
        System.out.println("Element added");
        display();
    }

    public int deleteAtFront(){
        if(f==-1){
            System.out.println("Queue Overflow");
            return -1;
        }
        int value = dq[f];
        if(f==r){
            f=-1;
            r=-1;
        }
            f++;
        display();
        return value;
    }

    public int deleteAtRear(){
        if(r==-1){
            System.out.println("Overflow");
            return 0;
        }
        int y = dq[r];
        if (r==f) {
            r=-1;
            f=-1;
        }else {
            r--;
        }
        return y; 
    }
    public void display() {
        System.out.println("Display");
        for (int i = 0; i < size; i++) {
            System.out.print(dq[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of queue");
        int n =sc.nextInt();

        DQueue dq = new DQueue(n);
        int x =1;

        while(x<6){
            System.out.println("Enter 1 for insert at front");
            System.out.println("Enter 2 for insert at rear");
            System.out.println("Enter 3 for delete at front");
            System.out.println("Enter 4 for delete at rear");
            System.out.println("Enter 5 for display");
            x = sc.nextInt();

            switch(x){
                case 1:
                System.out.println("Enter the value");
                int value1 = sc.nextInt();
                dq.insertAtFront(value1);
                break;

                case 2:
                System.out.println("Enter the value");
                int value2 = sc.nextInt();
                dq.insertAtRear(value2);
                break;

                case 3:
                int y1 = dq.deleteAtFront();
                if(y1>-1){
                    System.out.println(y1+"Deleted");
                }
                break;

                case 4:
                int y2 = dq.deleteAtRear();
                if(y2>-1){
                    System.out.println(y2+"Deleted");
                } 
                break;

                case 5:
                dq.display();
                break;

                default: 
                break;
            }
        }
        sc.close();
    }
} 