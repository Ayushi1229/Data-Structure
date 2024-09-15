import java.util.Scanner;
public class Vowel {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        char str = sc.nextLine().charAt(0);
        if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u'||str=='A'||str=='E'||str=='I'||str=='O'||str=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
