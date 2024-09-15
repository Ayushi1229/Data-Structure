import java.util.Scanner;

public class Lab7_2 {
    int TOP = -1;
    int MAX;
    char[] s;

    public Lab7_2(int size) {
        MAX = size;
        s = new char[MAX];
        TOP = -1;
    }

    public void push(char value) {
        if (TOP >= MAX - 1) {
            System.out.println("Stack OverFlow");
        } else {
            TOP++;
            s[TOP] = value;
        }
    }

    public char pop() {
        if (TOP < 0) {
            System.out.println("Stack UnderFlow");
            return '\0'; 
        } else {
            return s[TOP--];
        }
    }

    public static boolean checkString(String str, int max) {
        Lab7_2 stack = new Lab7_2(max);

        // Initialize stack with 'c'
        stack.push('c');

        int index = 0;
        char next = str.charAt(index);

        while (next != 'c') {
            if (next == ' ') {
                return false; // Invalid string if blank is encountered
            }
            stack.push(next);
            index++;
            if (index >= str.length()) {
                return false; // Invalid if no 'c' is found
            }
            next = str.charAt(index);
        }

        index++; // Move past the 'c'

        // Compare characters following 'c' with stack
        while (stack.s[stack.TOP] != 'c') {
            if (index >= str.length()) {
                return false; // Invalid if string ends prematurely
            }
            next = str.charAt(index);
            char x = stack.pop();
            if (next != x) {
                return false; // Invalid if characters do not match
            }
            index++;
        }

        // Next symbol must be blank
        if (index < str.length()) {
            next = str.charAt(index);
        } else {
            next = ' '; // Consider it blank if string ended
        }
        return next == ' '; // Valid only if the next symbol is blank
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int max = str.length() + 1; // The stack size should be at least the length of the string + 1 for 'c'

        if (checkString(str, max)) {
            System.out.println("VALID STRING");
        } else {
            System.out.println("INVALID STRING");
        }

        sc.close();
    }
}