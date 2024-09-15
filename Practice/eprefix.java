package Practice;
import java.util.Scanner;
import java.util.Stack;

public class eprefix {
    public static int evaluate(String n) {
        Stack<Integer> stack = new Stack<>();

        for (int i = n.length() - 1; i >= 0; i--) {
            char next = n.charAt(i);

        
                if (Character.isDigit(next)) {
            
            
                    int new1 = 0;
                    while (next != ',') {
                        new1 = new1 * 10 + Integer.parseInt(next + "");
                        i++;
                        next = n.charAt(i);
                        System.out.println(new1);
                        stack.push(new1);
                    
                }
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (next) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand2 - operand1);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand2 / operand1);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter refix string");
        String n=sc.nextLine();
        System.out.println("Prefix Expression: " + n);
        System.out.println("Evaluated Result: " + evaluate(n));
    }
}