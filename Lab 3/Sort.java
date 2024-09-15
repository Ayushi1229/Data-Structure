import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        int n = 7;
        String names[] = {"Nidhi","Ayushi","Khushi","Mansi","Khush","Yash","Krish"};
        Arrays.sort(names);
        System.out.println("The names in alphabetical order are:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}
