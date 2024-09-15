import java.util.Scanner;
public class year_month_days {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int year,week,days;
        year = n/365;
        n = n%365;
        week = n/52;
        days = n%52;
        System.out.println(year + " " + week + " " + days);
    }
}
