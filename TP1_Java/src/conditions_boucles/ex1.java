package conditions_boucles;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("Positif");
        } else if (x < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Nul");
        }
        sc.close();
    }
}