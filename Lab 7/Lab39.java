import java.util.Scanner;

class Stackdemo {
    int top = -1;
    char a[];

    Stackdemo(int size) {
        a = new char[size];
    }

    void push(char x) {
        if (top >= a.length) {
            System.out.println("stack overflow");
        } else {
            top = top + 1;
            a[top] = x;
            return;
        }
    }

    char pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return 0;
        } else {
            top = top - 1;
            return a[top + 1];
        }
    }

}

class Lab39{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.next();

        Stackdemo sd = new Stackdemo(s1.length());
        sd.push('c');
        int i = 0;
        char next = s1.charAt(0);
        while (next != 'c') {
            if (next == ' ') {
                System.out.println("Invalid string");
                return;
            } else {
                sd.push(next);
                i++;
                next = s1.charAt(i);
            }

        }
        i++;
        int x;
        while (sd.a[sd.top] != 'c') {
            next = s1.charAt(i);
            x = sd.pop();
            if (next != x) {
                System.out.println("Invalid string");

                return;
            }
            i++;

        }

        System.out.println("valid string");

	}
}