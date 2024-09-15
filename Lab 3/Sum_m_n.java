import java.util.Scanner;
public class Sum_m_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting value m:");
        int m = sc.nextInt();
        System.out.println("Enter ending value n:");
        int n = sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of number is " + sum);
    }
}
