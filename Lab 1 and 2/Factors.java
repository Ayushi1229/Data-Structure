import java.util.Scanner;

public class Factors {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("Factors present");
            }
            else{
                System.out.println("No factors available");
            }
        }
    }
}
