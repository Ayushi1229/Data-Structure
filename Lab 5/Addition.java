import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for matrix a:");
        int[][] a = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for matrix b:");
        int[][] b = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            b[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
            
        System.out.println("Sum of Matrix:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
