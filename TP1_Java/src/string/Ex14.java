package string;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int i = 0;
        int j = s.length() - 1;
        boolean ok = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                ok = false;
                break;
            }
            i++;
            j--;
        }

        if (ok) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Pas palindrome");
        }

        sc.close();
    }
}