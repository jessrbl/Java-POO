package VectorsPart1;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);  // Troque para Locale.getDefault() se necessário
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the length of your array: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer:");
            sc.next(); // descarta entrada inválida
        }
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array length.");
        } else {
            double[] vect = new double[n];

            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < vect.length; i++) {
                while (!sc.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a number:");
                    sc.next(); // descarta a entrada inválida
                }
                vect[i] = sc.nextDouble();
            }

            double sum = 0.0;
            for (double v : vect) {
                sum += v;
            }

            double avg = sum / n;
            System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        }

        sc.close();
    }
}
