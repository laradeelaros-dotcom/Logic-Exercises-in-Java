public class CartProcessor {
    public static void main (String[] args){
        /*double basePrice = 50.50;
        double taxRate = 0.15;
        double calcTax = basePrice * taxRate;
        double finalPrice = calcTax + basePrice;
        System.out.println(finalPrice);

        if  (finalPrice < 150.00) {
        double finalPrice1 = finalPrice + 15.00;
            System.out.println("Shipping cost applied. New total: " + finalPrice1);
        } else {
            System.out.println("Eligible for Free Shipping.");
        }*/

       double[] itemPrices = {10.00, 10.00, 5.0, 1000};
       double totalCartValue = 0.0;

       for (int i = 0; i < itemPrices.length; i++){
           totalCartValue += itemPrices[i];
       }
       System.out.println("Total cart value: " + totalCartValue);
    }
}