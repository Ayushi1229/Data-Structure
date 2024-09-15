package Practice;

import java.util.Scanner;

class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int a1[] = new int[n];
        int a2[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println("enter a a[" + i + "]=");
            a1[i] = sc.nextInt();
        }
        System.out.println("enter a index");
        int index = sc.nextInt();
        System.out.println("enter num");
        int num = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            if (i < index) {
                a2[i] = a1[i];
            } else if (i == index) {
                a2[i] = num;
            } else {
                a2[i] = a1[i - 1];
            }
            System.out.println(a2[i]);
        }
    }
}
