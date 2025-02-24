package Exercise_NegativeNumbers;

import java.util.Locale;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you're gonna digit? ");
        int n = sc.nextInt();


        int[] number = new int[n];

        for (int i = 0; i < number.length; i++) {
            System.out.printf("Write the number " + (i+1) + ": ");
            number[i] = sc.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS: ");
        for (int j : number) {
            if (j < 0) {
                System.out.println(j);
            }
        }


        sc.close();



    }
}
