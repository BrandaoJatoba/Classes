import java.util.Scanner;
public class Exercise_Three{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter student's name and grades: ");
                Student x = new Student();
                System.out.print("Name: ");
                x.name = sc.nextLine();
                System.out.print("Grade 1: ");
                x.nota1 = sc.nextDouble();
                System.out.print("Grade 2: ");
                x.nota2 = sc.nextDouble();
                System.out.print("Grade 3: ");
                x.nota3 = sc.nextDouble();
                System.out.printf(x.finalGrade());
                sc.close();   
        }
}