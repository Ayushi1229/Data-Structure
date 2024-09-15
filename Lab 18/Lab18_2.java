import java.util.Scanner;

public class Lab18_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] n = {11,22,33,44,55,66,77,88,99};

        int element = sc.nextInt();

        int left =0;
        int right= n.length - 1;
        int mid;
        while(left<=right){
            mid = (left + right) / 2;
            if (n[mid] == element){
                System.out.println("The element is:"+mid);
                break;
            }
            if (n[mid] > element)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return;
    }
}
