import java.util.Scanner;

public class Insertsort {
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
        System.out.println("Enter num:");
        int num = sc.nextInt();
        for(int i=0;i<n;i++){
            if(a1[i]<num){
                a2[i]=a1[i];
            }
            else if(a1[i]>num&&a1[i-1]<num){
                a2[i]=num;
            }
            else{
                a2[i]=a1[i-1];
            }
            System.out.println(a2[i]);
        }
    }
}


