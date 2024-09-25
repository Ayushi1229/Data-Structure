import java.util.Scanner;

class Pro53 {
    private int[] queue;
    private int size;
    private int capacity;

    public Pro53(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        size = 0;
    }

    public void insert(int element) {
        if (size == capacity) {
            System.out.println("Queue is full, cannot insert");
            return;
        }

        int i;
        for (i = size - 1; i >= 0 && queue[i] > element; i--) {
            queue[i + 1] = queue[i];  
        }
        queue[i + 1] = element;  
        size++;
        System.out.println("Inserted element: " + element);
    }

    public void delete() {
        if (size == 0) {
            System.out.println("Queue is empty, cannot delete");
            return;
        }

        int removedElement = queue[0];
        for (int i = 1; i < size; i++) {
            queue[i - 1] = queue[i];
        }
        size--;
        System.out.println("Deleted element: " + removedElement);
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Priority Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Pro53 pq = new Pro53(10);
        
        int choice, element;

        do {
            System.out.println("\nPriority Queue Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    element = scanner.nextInt();
                    pq.insert(element);
                    break;
                case 2:
                    pq.delete();
                    break;
                case 3:
                    pq.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}
