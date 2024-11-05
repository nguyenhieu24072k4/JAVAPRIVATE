package Buoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static SinhVien inputStudentInfo() {
        System.out.print("Nhập mã sinh viên: ");
        String studentCode = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String fullName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Bỏ qua dòng mới
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        return new SinhVien(studentCode, fullName, age, phoneNumber, email);
    }

    public static void main(String[] args) {
        ArrayList<SinhVien> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("---- Menu ----");
            System.out.println("1. Nhập thông tin cho sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    SinhVien student = inputStudentInfo();
                    students.add(student);
                    System.out.println("Thông tin sinh viên đã được lưu.");
                    break;
                case 2:

                    System.out.println(
                            "| Mã SV      | Họ tên              | Tuổi | Số điện thoại    | Email                       |");
                    System.out.println(
                            "------------------------------------------------------------------------------------------");
                    for (SinhVien s : students) {
                        s.display();
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);
    }
}
