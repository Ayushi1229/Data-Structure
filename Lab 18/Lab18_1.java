import java.util.Scanner;

public class Lab18_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n[] = {1,2,3,4,5,6,7};
        System.out.println("Enter element to search");
        int x = sc.nextInt();
        for(int i=0;i<n.length;i++){
        if(x==n[i]){
            System.out.println("Element found");
        }
        }
        sc.close();
    }
}
