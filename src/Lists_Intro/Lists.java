package Lists_Intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listOfNames = new ArrayList<>();

        while (true) {
            System.out.print("Write a name (or type 'sair' to finish): ");
            String name = sc.next();

            if (name.equalsIgnoreCase("sair")) { // Sai do loop se o usuário digitar "sair"
                break;
            }

            listOfNames.add(name);
        }

        System.out.println("List of names: " + listOfNames.toString());
        sc.close();
    }
}
