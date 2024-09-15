import java.util.Scanner;
public class Stack {
    int TOP=-1;
    int MAX;
    int[] s = new int[MAX];
    public Stack(int size) {
        MAX = size;
        s = new int[MAX];
        TOP = -1;
    }


    public void push(int value){
        if(TOP>=MAX-1){
            System.out.println("Stack OverFlow");
        }
        else{
            TOP++;
            s[TOP]=value;
        }
    }
    public int pop(){
        if(TOP==0){
            System.out.println("Stack UnderFlow");
        }else{
            TOP--;
        }
        return s[TOP+1];
    }
    public int peep(int i){
        if(TOP-i+1<=0){
            System.out.println("Stack UnderFlow");
        }
            return (s[TOP-i+1]);
    }
    public void change(int x, int a){
        if(TOP-a+1<=0){
            System.out.println("Stack UnderFlow");
        }else{
            s[TOP-a+1]=x;
        }
    }
    public void display(){
        if(TOP<0){
            System.out.println("Stack is empty");
        }        
        System.out.println("Stack Elements:");
        for(int j=0;j<=TOP;j++){
            System.out.println(s[j]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum size of array:");
        int max = sc.nextInt();
        Stack stack = new Stack(max);
        
        while(true){
            System.out.println("Menu:");
            System.out.println("Enter 1 for push");
            System.out.println("Enter 2 for pop");
            System.out.println("Enter 3 for peep");
            System.out.println("Enter 4 for change");
            System.out.println("Enter 5 for display");
            System.out.println("Enter 6 for exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter value to push");
                int value = sc.nextInt();
                stack.push(value);
                break;

                case 2:
                System.out.println("Popped Value:" + stack.pop());
                break;

                case 3:
                System.out.println("Enter the index:");
                int i = sc.nextInt();
                stack.peep(i);
                break;

                case 4:
                System.out.println("Enter the number and index:");
                int x = sc.nextInt();
                int a = sc.nextInt();
                stack.change(x,a);
                break;

                case 5:
                stack.display();
                break;

                case 6:
                System.out.println("Completed");
                sc.close();

                default:
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

}

// import java.util.Scanner;

// public class Stack {
//     int TOP;
//     int MAX;
//     int[] s;

//     public Stack(int size) {
//         MAX = size;
//         s = new int[MAX];
//         TOP = -1;
//     }

//     public void push(int value) {
//         if (TOP >= MAX - 1) {
//             System.out.println("Stack Overflow");
//         } else {
//             s[++TOP] = value;
//             System.out.println("Pushed Value: " + value);
//         }
//     }

//     public int pop() {
//         if (TOP < 0) {
//             System.out.println("Stack Underflow");
//             return -1;
//         } else {
//             int value = s[TOP--];
//             return value;
//         }
//     }

//     public int peep(int i) {
//         if (i <= 0 || TOP - i + 1 < 0) {
//             System.out.println("Invalid index for Peep. Stack Underflow.");
//             return -1;
//         } else {
//             return s[TOP - i + 1];
//         }
//     }

//     public void change(int x, int a) {
//         if (a <= 0 || TOP - a + 1 < 0) {
//             System.out.println("Invalid index for Change. Stack Underflow.");
//         } else {
//             s[TOP - a + 1] = x;
//             System.out.println("Changed value at index " + a + " to " + x);
//         }
//     }

//     public void display() {
//         if (TOP < 0) {
//             System.out.println("Stack is empty");
//         } else {
//             System.out.println("Stack Elements:");
//             for (int j = TOP; j >= 0; j--) {
//                 System.out.print(s[j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter maximum size of stack: ");
//         int max = sc.nextInt();
//         Stack stack = new Stack(max);

//         while (true) {
//             System.out.println("\nMenu:");
//             System.out.println("1. Push");
//             System.out.println("2. Pop");
//             System.out.println("3. Peep");
//             System.out.println("4. Change");
//             System.out.println("5. Display");
//             System.out.println("6. Exit");
//             System.out.print("Enter your choice: ");
//             int choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter value to push: ");
//                     int value = sc.nextInt();
//                     stack.push(value);
//                     break;
//                 case 2:
//                     int poppedValue = stack.pop();
//                     if (poppedValue != -1) {
//                         System.out.println("Popped Value: " + poppedValue);
//                     }
//                     break;
//                 case 3:
//                     System.out.print("Enter the index (1-based): ");
//                     int i = sc.nextInt();
//                     int peepedValue = stack.peep(i);
//                     if (peepedValue != -1) {
//                         System.out.println("Peeped Value: " + peepedValue);
//                     }
//                     break;
//                 case 4:
//                     System.out.print("Enter the value and index (1-based): ");
//                     int x = sc.nextInt();
//                     int a = sc.nextInt();
//                     stack.change(x, a);
//                     break;
//                 case 5:
//                     stack.display();
//                     break;
//                 case 6:
//                     System.out.println("Exiting program.");
//                     sc.close();
//                     return;
//                 default:
//                     System.out.println("Invalid choice. Try again.");
//             }
//         }
//     }
// }