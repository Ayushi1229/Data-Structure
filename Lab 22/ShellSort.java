import java.util.Scanner;
class ShellSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a[" + i + "]:");
            a[i] = sc.nextInt();
        }

        for (int gap = n/2; gap>= 1; gap = gap / 2) 
        {
            for (int j = gap; j < n; j++) 
            {
                for (int i =j -gap; i>= 0;i=i - gap) 
                {
                    if (a[i + gap] > a[i]) 
                    {
                        break;
                    } 
                    else {
                        int temp = a[i + gap];
                        a[i + gap] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
    }
}