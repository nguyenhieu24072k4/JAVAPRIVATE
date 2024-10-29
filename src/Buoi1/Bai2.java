package Buoi1;
import java.util.Scanner;
public class Bai2 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số nguyên: ");
	        int n = scanner.nextInt();

	        int kq = 1;
	        while (n != 0) {
	            int x = n % 10;
	            kq *= x;
	            n /= 10;
	        }

	        System.out.println("Tích các chữ số: " + Math.abs(kq));
	    }

}
