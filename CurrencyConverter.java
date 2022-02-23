public class CurrencyConverter {

        static final double IOF = 0.06;

        public static double finalPrice(double price, double quantity) {
                double valor = (price * quantity) + (price * quantity * IOF);
                return valor;
        }
        
}
