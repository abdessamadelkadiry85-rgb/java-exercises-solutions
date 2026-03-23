package tableaux;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] t = new int[N];

        for (int i = 0; i < N; i++) {
            t[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            System.out.println("t[" + i + "] = " + t[i]);
        }

        sc.close();
    }
}