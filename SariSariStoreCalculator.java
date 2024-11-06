package sarisaristorecalculator;

import java.util.Scanner;

public class SariSariStoreCalculator {
    public static void main(String[] args) {
        
        // Define the products and unit prices
        try (Scanner scanner = new Scanner(System.in)) {
          
         
            System.out.println( "Product Name:" + "Fast food" );
            System.out.println( "Product Code:" + "93110" );
            System.out.println( "Quanyity in Stock:" + "6" );
            System.out.println( "Price per Unit:" + "3020" + "" );
            System.out.println( "Supplier:" + "Rimuru Tempest" );
            System.out.println( "Expiration Date:" + "12-5-2100" );
            System.out.println( "Product Sold Today:" + "6" );
            System.out.println( "Discount Percentage:" + "10%" );
            System.out.println( "Reorder Threshold Quanitity:" + "6" );
            System.out.println( "Store Location:" + "Maa" );

           


            
            String[] products = {"Canned Goods", "Coffee", "Snacks", "Instant Noodles", "Kitchen Essentials", "Cleaning Products"};
            double[] unitPrices = {30.0, 5.0, 25.0, 8.0, 25.0, 35.0};
            int[] quantities = new int[products.length];
            double[] totals = new double[products.length];
            
            // Get quantities for each product and calculate the totals
            double totalCost = 0;
            
            System.out.println("Enter quantities for each product:");
            for (int i = 0; i < products.length; i++) {
                System.out.print(products[i] + " (₱" + unitPrices[i] + " per unit): ");
                quantities[i] = scanner.nextInt();
                totals[i] = unitPrices[i] * quantities[i];
                totalCost += totals[i];
            }
            
            // Display the results
            System.out.println("\nCost of Products");
            System.out.println("-------------------------------------------------");
            System.out.printf("%-20s %-10s %-10s %-10s\n", "Product", "Cost/Unit", "Quantity", "Total");
            System.out.println("-------------------------------------------------");
            
            for (int i = 0; i < products.length; i++) {
                System.out.printf("%-20s ₱%-10.2f %-10d ₱%-10.2f\n", products[i], unitPrices[i], quantities[i], totals[i]);
            }
            
            System.out.println("-------------------------------------------------");
            System.out.printf("Total Cost of Products: ₱%.2f\n", totalCost);
            
            // Apply a 20% markup
            double markup = 0.20 * totalCost;
            double finalPrice = totalCost + markup;
            System.out.printf("20%% Markup: ₱%.2f\n", markup);
            System.out.printf("Final Price: ₱%.2f\n", finalPrice);
        }
    }
}

 
   