
import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  n:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of numbers is:" + sum);
        int avg = (sum/n);
        System.out.println("Average of numbers is:" + avg);
    }
}
