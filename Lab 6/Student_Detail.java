
import java.util.Scanner;
class Student {
    int Enrollment_No;
    String Name;
    int Semester;
    double CPI;
    Student( int Enrollment_No, String Name, int Semester, double CPI){
        this.Enrollment_No = Enrollment_No;
        this.Name = Name;
        this.Semester = Semester;
        this.CPI = CPI;
    }
    public void printDetails(){
        System.out.println("Enrollment_No:"+this.Enrollment_No);
        System.out.println("Name:"+this.Name);
        System.out.println("Semester:"+this.Semester);
        System.out.println("CPI:"+this.CPI);
    }
}
public class Student_Detail{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of students");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details for student"+(i+1)+":");
            System.out.print("Enrollment_No: ");
            int Enrollment_No = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String Name = sc.nextLine();
            System.out.print("Semester: ");
            int Semester = sc.nextInt();
            System.out.print("CPI: ");
            double CPI = sc.nextDouble();
            sc.nextLine();

            s[i] = new Student(Enrollment_No, Name, Semester, CPI);
        }
    }
}
