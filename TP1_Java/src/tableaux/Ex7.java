package tableaux;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] t = new int[N];

        for (int i = 0; i < N; i++) {
            t[i] = sc.nextInt();
        }

        int max = t[0];
        for (int i = 1; i < N; i++) {
            if (t[i] > max) max = t[i];
        }

        System.out.println("Max = " + max);
        sc.close();
    }
}