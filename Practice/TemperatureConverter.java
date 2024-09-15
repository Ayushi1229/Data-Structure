package Practice;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convert Celsius to Fahrenheit
        double f = celsius * 1.8 + 32;

        // Convert Fahrenheit to Celsius
        double c = (fahrenheit - 32) / 1.8;

        System.out.println("Value of " + fahrenheit + " Fahrenheit in Celsius: " + c);
        System.out.println("Value of " + celsius + " Celsius in Fahrenheit: " + f);
    }
}
