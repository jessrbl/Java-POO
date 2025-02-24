package ExerciseMultiArrays;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the number of lines? ");
        System.out.flush();
        int n = sc.nextInt();
        System.out.println("What is the number of columns? ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        System.out.println("Enter the matrix values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("What is the number you want to map? ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Number found in position [" + i + "][" + j + "]");

                    if (j - 1 >= 0) // Left
                        System.out.println("Left: " + mat[i][j - 1]);

                    if (j + 1 < mat[i].length) // Right
                        System.out.println("Right: " + mat[i][j + 1]);

                    if (i + 1 < mat.length) // Down
                        System.out.println("Down: " + mat[i + 1][j]);
                }
            }
        }

        sc.close();
    }
}
