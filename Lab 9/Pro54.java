import java.util.Scanner;
import java.util.Stack;

public class Pro54 {
    private Stack<String> feathers;

    
    public Pro54() {
        feathers = new Stack<>();
    }

   
    public void addFeather(String feather) {
        feathers.push(feather);
        System.out.println(feather + " added to the stack.");
    }

    
    public void pickPartyFeather() {
        if (feathers.isEmpty()) {
            System.out.println("No feathers in the stack.");
            return;
        }
        String topFeather = feathers.peek();
        System.out.println("Percy picks the party feather: " + topFeather);
    }

   
    public void displayFeathers() {
        if (feathers.isEmpty()) {
            System.out.println("No feathers in the stack.");
            return;
        }
        System.out.println("Feathers in the stack (top to bottom):");
        for (int i = feathers.size() - 1; i >= 0; i--) {
            System.out.println(feathers.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pro54 stack = new Pro54();

        while (true) {
            System.out.println("\nFeather Stack Menu:");
            System.out.println("1. Add Feather");
            System.out.println("2. Pick Party Feather");
            System.out.println("3. Display All Feathers");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter the feather to add: ");
                    String feather = scanner.nextLine();
                    stack.addFeather(feather);
                    break;
                case 2:
                    stack.pickPartyFeather();
                    break;
                case 3:
                    stack.displayFeathers();
                    break;
                case 4:
                    System.out.println("Exit");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}