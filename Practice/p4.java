package Practice ;
import java.util.*;
public class p4 {
        public static void main(String[] args) {
            float first = 1.20f, second = 2.45f;
    
            System.out.println("--Before swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
    
            // Swap using a temporary variable
            float temporary = first;
            first = second;
            second = temporary;
    
            System.out.println("--After swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
        }
    }
    
    // public class SwapNumbers {
    //     public static void main(String[] args) {
    //         float first = 12.0f, second = 24.5f;
    
    //         System.out.println("--Before swap--");
    //         System.out.println("First number = " + first);
    //         System.out.println("Second number = " + second);
    
    //         // Swap without using a temporary variable
    //         first = first - second;
    //         second = first + second;
    //         first = second - first;
    
    //         System.out.println("--After swap--");
    //         System.out.println("First number = " + first);
    //         System.out.println("Second number = " + second);
    //     }
    // }
    