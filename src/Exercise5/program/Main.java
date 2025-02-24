package Exercise5.program;

import Exercise5.entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the account holder: ");
        String client = sc.nextLine();


        System.out.println("Is there an initial deposit value? (y/n): ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount(accountNumber, client, initialDeposit);
        } else {
            account = new BankAccount(accountNumber, client);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();


    }


    }

