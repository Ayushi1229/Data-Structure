import java.util.Scanner;
public class Swap {
    public static void SwapNum(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped Numbers:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a:");
    int a = sc.nextInt();
    System.out.println("Enter b:");
    int b = sc.nextInt();
    SwapNum(a, b);   
}
}