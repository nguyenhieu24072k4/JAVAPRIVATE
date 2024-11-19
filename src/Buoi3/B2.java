package Buoi3;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        char[] s = new char[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().charAt(0);
        }
        char[] h = new char[100];
        char[] d = new char[100];
        for (int i = 0; i < n; i++) {
            if ((int) s[i] <= 49 && (int) s[i] < 58) {
                h[i] = s[i];
            } else if (((int) s[i] > 64 && (int) s[i] < 91) || ((int) s[i] > 96 && (int) s[i] < 123)) {
                d[i] = s[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(h[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(d[i] + " ");
        }
    }

}