import java.util.Scanner;
public class Power {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter base and exponent:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            
        int base = x, exponent = y;

        long result = 1;
        
        while (exponent != 0) {
            result *= base;
            --exponent;
        }

            System.out.println("Answer = " + result);
        }
        }

//Logic 2
// int sum=1,i,n,p;
// System.out.println("Enter number:");
// n = sc.nextInt();
// System.out.println("Enter power:");
// p = sc.nextInt();
// for(i=1;i<=p;i++){
//     sum = sum*n;
// }
// System.out.println("sum="+sum)