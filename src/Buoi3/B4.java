package Buoi3;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
