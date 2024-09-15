import java.util.Arrays;

public class Merge {
    public static void main(String[] args){
        int[] a={3,2,1};
        int[] b={4,5,6};
        int[] c= new int[a.length + b.length];
        int n =a.length + b.length;
        for(int i=0;i<a.length;i++){
            c[i] = a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i + a.length] = b[i];
        }
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (c[i] > c[k]) {
                    int temp = c[i];
                    c[i] = c[k];
                    c[k] = temp;
                    }
                }
            }
            System.out.println("The array after merging two unsorted array:");
                            System.out.print(Arrays.toString(c) + " ");
    }
}
