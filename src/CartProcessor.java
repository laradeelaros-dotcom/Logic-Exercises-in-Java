public class CartProcessor {
    public static void main (String[] args){
        double basePrice = 50.50;
        double taxRate = 0.15;
        double calcTax = basePrice * taxRate;
        double finalPrice = calcTax + basePrice;
        System.out.println(finalPrice);

        if  (finalPrice < 150.00) {
        double finalPrice1 = finalPrice + 15.00;
            System.out.println("Shipping cost applied. New total: " + finalPrice1);
        } else {
            System.out.println("Eligible for Free Shipping.");
        }
    }
}