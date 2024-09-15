import java.util.Scanner;
public class Insert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int a1[] = new int[n];
        int a2[] = new int[n+1];
        for(int i=0;i<n;i++){
            System.out.println("Enter a["+i+"]:");
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter index:");
        int index = sc.nextInt();
        System.out.println("Enter num:");
        int num = sc.nextInt();
        for(int i=0;i<n+1;i++){
            if(i<index){
                a2[i]=a1[i];
            }
            else if(i==index){
                a2[i]=num;
            }
            else{
                a2[i]=a1[i-1];
            }
            System.out.println(a2[i]);
        }
    }
}
