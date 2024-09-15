package Practice;
import java.util.Scanner;
import java.util.Stack;

public class epostfix {
    public static int evaluate(String n) {
        Stack<Integer> stack = new Stack<>();
        int top = 0;

        for (int i = 0; i < n.length(); i++) {

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
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (next) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    case '^':
                        stack.push(operand1 ^ operand2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr postfix expression");
        String n = sc.nextLine();
        System.out.println("Evaluated Result: " + evaluate(n));

    }
}
