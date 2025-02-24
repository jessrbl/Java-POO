package VectorsPart2.program;
import VectorsPart2.entities.Person;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be typed? ");
        int n = sc.nextInt();
        Person[] people = new Person[n];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Data from the " + (i + 1) + "ª person: ");

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();

            people[i] = new Person(name, age, height);
        }


        sc.close();

        double totalHeight = 0;
        for (Person p : people) {
            totalHeight += p.getHeight();
        }
        double averageHeight = totalHeight / people.length;

        System.out.printf("Average height: %.2f%n", averageHeight);

        int countUnder16 = 0;
        double sumAgeUnder16 = 0;

        ArrayList<String> namesUnderAgeSixteen = new ArrayList<>();
        boolean noUnder16 = true;

        for (Person p : people) {
            if (p.getAge() < 16) {
                sumAgeUnder16 += p.getAge();
                countUnder16++;
                namesUnderAgeSixteen.add(p.getName());
                noUnder16 = false;
            }
        }

        if (!noUnder16) {
            System.out.println("People under age 16:");
            for (String name : namesUnderAgeSixteen) {
                System.out.println(name);
            }

            double percentage = (double) countUnder16 / people.length * 100;
            System.out.printf("People under 16 years: %.1f%%%n", percentage);
        } else {
            System.out.println("No person registered under 16 years.");
        }
    }
}






