import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double n = sc.nextDouble();
        double Area = 3.14*n*n;
        System.out.println(Area); 
    }
}