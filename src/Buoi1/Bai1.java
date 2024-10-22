package Buoi1;
import java.util.Scanner;
public class Bai1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số ở hệ cơ số 10: ");
	        int nb = scanner.nextInt();

	        System.out.print("Nhập hệ cơ số muốn chuyển: ");
	        int b = scanner.nextInt();

	        if (b < 2 || b > 16) {
	            System.out.println("Hệ cơ số không hợp lệ!");
	            return;
	        }

	        String result = Integer.toString(nb, b).toUpperCase();
	        System.out.println("Kết quả chuyển đổi: " + result);
	    }
}
