import java.util.*;
import java.util.Stack;

class Pro49 {

    public static void main(String[] args) {
        String b = "-,*,+,4,3,2,5";
        String ans = reverse(b);

        Stack<Integer> s1 = new Stack<>();
        String[] c = ans.split(",");
        int value = 0;
        for (int i = 0; i < c.length; i++) {
            value = 0;
            if (c[i].equals("+")) {
                int operand1 = s1.pop();
                int operand2 = s1.pop();
                value = operand1 + operand2;
                s1.push(value);
            } else if (c[i].equals("-")) {
                int operand1 = s1.pop();
                int operand2 = s1.pop();
                value = operand1 - operand2;
                s1.push(value);
            } else if (c[i].equals("*")) {
                int operand1 = s1.pop();
                int operand2 = s1.pop();
                value = operand1 * operand2;
                s1.push(value);
            } else if (c[i].equals("/")) {
                int operand1 = s1.pop();
                int operand2 = s1.pop();
                value = operand1 / operand2;
                s1.push(value);
            } else {
                int temp = Integer.parseInt(c[i]);
                s1.push(temp);
            }
        }
        System.out.println(value);

    }

    static String reverse(String re) {
        int length = re.length();
        String news1 = "";
        for (int i = length - 1; i >= 0; i--) {
            char c = re.charAt(i);
            news1 = news1 + c;

        }
        return news1;

    }
}