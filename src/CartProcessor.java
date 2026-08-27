public class CartProcessor {

    public static void main (String[] args){
        double firtItem = calculateItem(20.00, 0.15);
        System.out.println("Result for item 1: " + firtItem);

        double secondItem = calculateItem(3000.00, 0.15);
        System.out.println("Result for item 2: " + secondItem);



       /*double[] itemPrices = {10.00, 10.00, 5.0, 1000};
       double totalCartValue = 0.0;

       for (int i = 0; i < itemPrices.length; i++){
           totalCartValue += itemPrices[i];
       }
       System.out.println("Total cart value: " + totalCartValue);*/
    }

    public static double calculateItem(double basePrice, double taxRate){
        double calcTax = basePrice * taxRate;
        double finalPrice = calcTax + basePrice;

        if  (finalPrice < 150.00) {
            double finalPriceWithShipping = finalPrice + 15.00;
            System.out.println("Shipping cost applied. New total: " + finalPriceWithShipping);
            return finalPriceWithShipping;
        } else {
            System.out.println("Eligible for Free Shipping.");
            return finalPrice;
        }


    }

}