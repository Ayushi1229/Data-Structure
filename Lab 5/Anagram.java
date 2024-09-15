import java.util.*;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size");
        int size = sc.nextInt();
        String[] first = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value of first array");
            first[i] = sc.next();
        }
        int temp = (int) (Math.random() * size);
        System.out.println("your selected number's element");
        System.out.println(first[temp]);
        String newWord = sc.next();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (first[temp].length() == newWord.length()) {
                if (first[temp].charAt(i) == newWord.charAt(i)) {
                    count++;
                }
            }

        }
        if (count == 0) {
            System.out.println("Given word is not anagram");
        } else {
            System.out.println("Given word is anagram");
        }
    }
}