import java.util.Scanner;
public class Factorial_recursion {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
    public static int fact(int n){
        if(n==1){
            return 1;
            }
            else{
                return n*fact(n-1);
            }
    } 
    
}
