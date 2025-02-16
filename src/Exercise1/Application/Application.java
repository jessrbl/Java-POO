package Exercise1.Application;
import Exercise1.Employee.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("What is your name? ");
        employee.setName(sc.nextLine());

        System.out.println("What is your gross Salary? ");
        employee.setGrossSalary(sc.nextDouble());

        System.out.println("What is your Tax?");
        employee.setTax(sc.nextDouble());

        System.out.printf("Employee: %s, $ %.2f%n", employee.getName(), employee.NetSalary());

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);
        System.out.printf("Updated data: $ %.2f%n", employee.getGrossSalary());


        sc.close();




    }









}
