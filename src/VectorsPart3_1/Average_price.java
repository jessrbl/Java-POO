package VectorsPart3_1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Average_price {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many items you want to add? ");
        int n = sc.nextInt();

        String[] productName = new String[n];
        double[] productPrice = new double[n];

        for (int i =0; i<n; i++) {
            System.out.print("Enter product name: ");
            productName[i] = sc.next();  // Preenche a posição i do array

            System.out.print("Enter product price: ");
            productPrice[i] = sc.nextDouble();  // Preenche a posição i do array
        }

        double sum = 0.0;

        for (double price: productPrice) {
            sum += price;
        }

        double averagePrice = sum/n;
        System.out.printf("AVERAGE PRICE = %.2f", averagePrice);

    }
}
