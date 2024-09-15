import java.util.Scanner;
class Temp_Convesion {
    double temp;
    public void celsius_Conversion(double t){
        this.temp = ((t-32)*5)/(9.0);
        System.out.println(temp);
    }
    public void fahrenheit_Conversion(double t){
        this.temp = (9/5)*t + (32);
        System.out.println(temp);
    }
}
    public class Temperature{
        public static void main(String[] args){
            Scanner sc =  new Scanner(System.in);
            System.out.println("Enter temperature:");
            double t = sc.nextDouble();
            System.out.println("Enter 1 to convert Celsius and 2 to convert Fahrenheit");
            int n = sc.nextInt();
            Temp_Convesion a = new Temp_Convesion();
            if(n==1){
                a.celsius_Conversion(t);
            }
            else if(n==2){
                a.fahrenheit_Conversion(t);
            }
        }
    }

