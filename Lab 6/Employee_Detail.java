import java.util.Scanner;

class Employee_Detail {
    int Employee_ID;
    String Name;
    String Designation;
    double Salary;

    public Employee_Detail(int employee_ID, String name, String designation, double salary) {
        this.Employee_ID = employee_ID;
        this.Name = name;
        this.Designation = designation;
        this.Salary = salary;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + Employee_ID);
        System.out.println("Name: " + Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary: " + Salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employee_ID = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        Employee_Detail employee = new Employee_Detail(employee_ID, name, designation, salary);

        System.out.println("\nEmployee Details:");
        employee.printDetails();

        scanner.close();
    }
}

