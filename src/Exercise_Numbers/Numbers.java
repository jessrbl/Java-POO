package Exercise_Numbers;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you gonna digit? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i< numbers.length; i++ ) {
            System.out.print("Write a number : ");
            numbers[i] += sc.nextDouble();
        }

        String values = Arrays.toString(numbers);

        double sum = 0.0;

        for (double number : numbers) {
            sum += number;
        }

        double media = sum/n;

        sc.close();

        System.out.println("VALUES = " + values);
        System.out.printf("SUM = %.2f \n", sum);
        System.out.printf("MEDIA = %.2f" , media);


    }
}


