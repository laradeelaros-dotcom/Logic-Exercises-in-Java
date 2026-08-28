public class InventoryManage {
    public static void main (String[] args) {
        double[] prices ={120.00, 45.50, 300.0, 15.0, 590.0, 26.36, 199.00, 1000.00} ;

        double maxPrice = findMostExpensive(prices);
        System.out.println("O produto mais caro custa: " + maxPrice);

    }

    public static double findMostExpensive ( double[] prices){
            double maxPrice = prices[0];

            for (int i = 0; i < prices.length; i++) {
                if (prices[i] > maxPrice) {
                    maxPrice = prices[i];
                }
            }
            return maxPrice;
        }

    }
