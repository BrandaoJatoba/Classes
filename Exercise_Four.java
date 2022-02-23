import java.util.Scanner;
public class Exercise_Four {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("What is the dollar price: ");
                double price = sc.nextDouble();
                System.out.print("How many dollars will be bought: ");
                double quantity = sc.nextDouble();
                System.out.printf("Amount to be paid in reais: " + 
                                CurrencyConverter.finalPrice(price, quantity));
                sc.close();  
        }
}
