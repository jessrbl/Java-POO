package Exercise2.Application;

import Exercise2.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();


        System.out.println("Enter the rectangle width and height: ");
        rectangle.setWidth(sc.nextDouble());
        rectangle.setHeight(sc.nextDouble());

        System.out.printf("AREA: %.2f%n", rectangle.Area());
        System.out.printf("PERIMETER: %.2f%n", rectangle.Perimeter());
        System.out.printf("DIAGONAL: %.2f%n", rectangle.Diagonal());



        sc.close();

    }
}
