import java.util.Scanner;

public class Exercise_Two {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Employee data:");
                Employee a = new Employee();
                System.out.print("Name: ");
                a.name = sc.nextLine();
                System.out.print("Gross Salary: ");
                a.grossSalary = sc.nextDouble();
                System.out.print("Tax: ");
                a.tax = sc.nextDouble();
                System.out.printf("Employee: %s, ", a.name);
                System.out.printf("$ = %.2f%n", a.NetSalary());
                System.out.print("Which percentage to increase salary? ");
                a.IncreaseSalary(sc.nextDouble());
                System.out.printf("Updated data -  Employee:  %s , $ %.2f%n", a.name, a.NetSalary());
                sc.close();
        }
}
