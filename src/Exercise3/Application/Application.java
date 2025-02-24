package Exercise3.Application;

import Exercise3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter the student name: ");
        student.setName(sc.nextLine());
        System.out.println("Enter the first grade: ");
        student.setFirstGrade(sc.nextDouble());
        System.out.println("Enter the second grade: ");
        student.setSecondGrade(sc.nextDouble());
        System.out.println("Enter the third grade: ");
        student.setThirdGrade(sc.nextDouble());

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

    }
}
