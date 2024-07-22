import java.util.*;
import java.util.Arrays;

public class AnagramGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }

        int m =(int) (Math.random()*n);
        // System.out.println(m);

        System.out.println("Original word: " + arr[m]);

        System.out.println("Enter an anagram: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        char[] c=arr[m].toCharArray();

        Arrays.sort(ch);
        Arrays.sort(c);

        if(Arrays.equals(ch, c)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not a Anagram");
        }
    }
}