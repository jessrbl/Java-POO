package VectorsPart1;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<vect.length; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (double v : vect) {
            sum += v;
        }

        double avg = sum / n;
        System.out.println("AVERAGE HEIGHT: " + avg);







        sc.close();
    }
}
