package Buoi7;


import Buoi7.common.PhysicalProduct;
import Buoi7.model.Role;
import Buoi7.model.User;
import Buoi7.service.ProductManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();

        // Khởi tạo danh sách người dùng
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("1", "Admin", "admin@gmail.com", "admin123",12,"1/2/2000", Role.AMIN));
        users.add(new User("2", "Customer", "customer@gmail.com", "customer123",10,"20/2/2001", Role.USER));

        User loggedInUser = null;

        // Đăng nhập
        System.out.println("=== Đăng nhập ===");
        System.out.print("Tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.print("Mật khẩu: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                loggedInUser = user;
                break;
            }
        }

        if (loggedInUser == null) {
            System.out.println("Tên đăng nhập hoặc mật khẩu không đúng!");
            return;
        }

        // Hiển thị menu dựa trên vai trò
        if (loggedInUser.getRole() == Role.AMIN) {
            int choice;
            do {
                System.out.println("=== Quản lý Sản phẩm (Admin) ===");
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Hiển thị danh sách sản phẩm");
                System.out.println("3. Tìm kiếm sản phẩm theo tên");
                System.out.println("4. Xóa sản phẩm theo mã");
                System.out.println("5. Cập nhật thông tin sản phẩm");
                System.out.println("6. Thoát");
                System.out.print("Lựa chọn: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Nhập mã sản phẩm: ");
                        String id = scanner.nextLine();
                        System.out.print("Nhập tên sản phẩm: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập giá sản phẩm: ");
                        double price = scanner.nextDouble();
                        System.out.print("Nhập số lượng: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        manager.addProduct(new PhysicalProduct(id, name, price, quantity), loggedInUser);
                        break;
                    case 2:
                        manager.displayProducts();
                        break;
                    case 3:
                        System.out.print("Nhập tên sản phẩm: ");
                        String searchName = scanner.nextLine();
                        manager.searchProductByName(searchName);
                        break;
                    case 4:
                        System.out.print("Nhập mã sản phẩm cần xóa: ");
                        String deleteId = scanner.nextLine();
                        manager.deleteProductById(deleteId, loggedInUser);
                        break;
                    case 5:
                        System.out.print("Nhập mã sản phẩm cần cập nhật: ");
                        String updateId = scanner.nextLine();
                        System.out.print("Nhập tên mới: ");
                        String newName = scanner.nextLine();
                        System.out.print("Nhập giá mới: ");
                        double newPrice = scanner.nextDouble();
                        System.out.print("Nhập số lượng mới: ");
                        int newQuantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        manager.updateProductById(updateId, loggedInUser, newName, newPrice, newQuantity);
                        break;
                    case 6:
                        System.out.println("Đã thoát.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }
            } while (choice != 6);
        } else {
            int choice;
            do {
                System.out.println("=== Xem Sản phẩm (Customer) ===");
                System.out.println("1. Hiển thị danh sách sản phẩm");
                System.out.println("2. Tìm kiếm sản phẩm theo tên");
                System.out.println("3. Thoát");
                System.out.print("Lựa chọn: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        manager.displayProducts();
                    case 2:
                        System.out.println("Nhập tên :");
                        String temp = scanner.nextLine();
                        manager.searchProductByName(temp);
                    case 3:
                        System.out.println("Đã thoát.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");

                }
            }while(choice<3);
        }
    }
}

