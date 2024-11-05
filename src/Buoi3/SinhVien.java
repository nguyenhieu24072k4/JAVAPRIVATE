package Buoi3;

import java.util.Scanner;

public class SinhVien {
    private String studentCode;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String email;

    // Constructor không tham số
    public SinhVien() {
    }

    // Constructor có tham số
    public SinhVien(String studentCode, String fullName, int age, String phoneNumber, String email) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters và Setters
    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Phương thức nhập thông tin sinh viên
    public void inputStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sinh viên: ");
        this.studentCode = scanner.nextLine();

        System.out.print("Nhập họ tên: ");
        this.fullName = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Bỏ qua dòng mới

        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = scanner.nextLine();

        System.out.print("Nhập email: ");
        this.email = scanner.nextLine();
    }

    public void display() {
        System.out.format("| %-10s | %-20s | %-3d | %-15s | %-25s |\n", studentCode, fullName, age, phoneNumber, email);
    }

    public static void main(String[] args) {

        SinhVien student = new SinhVien();

        // Gọi phương thức inputStudentInfo() để nhập thông tin cho sinh viên
        student.inputStudentInfo();

        // Hiển thị thông tin sinh viên
        System.out.println("Thông tin sinh viên:");
        System.out.println(
                "| Mã SV      | Họ tên              | Tuổi | Số điện thoại    | Email                       |");
        System.out
                .println("------------------------------------------------------------------------------------------");
        student.display();

    }
}
