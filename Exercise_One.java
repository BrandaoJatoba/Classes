import java.util.Scanner;


public class Exercise_One {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter rectangle widht and height: ");
                Rectangle a = new Rectangle();
                a.width = sc.nextDouble();
                a.height = sc.nextDouble();
                System.out.printf("AREA = %.2f%n", a.Area());
                System.out.printf("PERIMETER = %.2f%n", a.Perimeter());
                System.out.printf("DIAGONAL = %.2f%n", a.Diagonal());
                sc.close();
        }
}
