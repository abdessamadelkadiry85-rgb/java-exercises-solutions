package tableaux;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] t = new int[10];
        for (int i = 0; i < 10; i++) {
            t[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int pos = -1;

        for (int i = 0; i < 10; i++) {
            if (t[i] == x) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Non trouvé");
        } else {
            System.out.println("Position : " + pos);
        }

        sc.close();
    }
}