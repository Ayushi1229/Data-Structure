import java.util.Scanner;
public class Hour_min_sec {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hours, min, sec;
        hours = n/3600;
        n = n%3600;
        min = n/60;
        sec= n%60;
        System.out.println(hours + " " + min + " " +sec);
    }
}
