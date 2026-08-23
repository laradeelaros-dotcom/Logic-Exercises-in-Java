public class CartProcessor {
    public static void main (String[] args){
        double basePrice = 50.50;
        double taxRate = 0.15;
        double calcTax = basePrice * taxRate;
        double finalPrice = calcTax + basePrice;
        System.out.println(finalPrice);

    }
}