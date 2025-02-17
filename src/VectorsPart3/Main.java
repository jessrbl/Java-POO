package VectorsPart3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] product = new Product[n];

        for ( int i =0; i<product.length; i++ ) {

            sc.nextLine();

            String productName = sc.nextLine();
            double price = sc.nextDouble();

            product[i] = new Product(productName, price);

        }

        sc.close();

        double sum = 0.0;
        for (Product p : product) {
            sum += p.getPrice();
        }

        double averagePrice = sum / product.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", averagePrice);


    }
}
