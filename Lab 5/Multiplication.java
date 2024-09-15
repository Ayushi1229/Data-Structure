import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for matrix a:");
        int[][] a = new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
            a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for matrix b:");
        int[][] b = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
            b[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++)
                c[i][j] += a[i][k] * b[k][j];
            }
        }
        System.out.println("Multiplication of Matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
