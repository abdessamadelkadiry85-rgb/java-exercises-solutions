package matrices3x3;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
                sum += m[i][j];
            }
        }

        System.out.println("Somme = " + sum);
        sc.close();
    }
}