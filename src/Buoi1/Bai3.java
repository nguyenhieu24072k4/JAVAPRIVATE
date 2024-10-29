package Buoi1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[5];
        System.out.println("Nhập 5 số nguyên:");

        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : n) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        System.out.println("Hai số lớn nhất là: " + max1 + " " + max2);
    }

}
