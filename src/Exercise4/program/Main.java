package Exercise4.program;
import Exercise4.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        currencyConverter.setDollarPrice(sc.nextDouble());
        System.out.println("How many dollars will be bought? ");
        currencyConverter.setTotInDolars(sc.nextDouble());
        System.out.printf("Amount to be paid in reais = %.2f%n" , currencyConverter.amountToBePaid());

    }
}
