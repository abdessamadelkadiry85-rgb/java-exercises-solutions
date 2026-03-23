package conditions_boucles;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= N) {
            sum += i;
            i++;
        }

        System.out.println("Somme = " + sum);
        sc.close();
    }
}