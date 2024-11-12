package Buoi4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Thêm một số sách mẫu
        books.add(new Book(1, "Book 1", "Author 1", 1990, "Summary A", 100.0));
        books.add(new Book(2, "Book 2", "Author 2", 2000, "Summary B", 150.0));
        books.add(new Book(3, "Book 3", "Author 3", 1985, "Summary C", 200.0));
        books.add(new Book(4, "Book 4", "Author 4", 2010, "Summary D", 120.0));
        books.add(new Book(5, "Book 5", "Author 5", 1995, "Summary E", 180.0));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Chỉnh sửa thông tin sách");
            System.out.println("3. In ra danh sách các cuốn sách");
            System.out.println("4. In ra cuốn sách lâu đời cổ kính nhất");
            System.out.println("5. In ra cuốn sách phù hợp với giá tiền");
            System.out.println("6. Sắp xếp danh sách các cuốn sách");
            System.out.println("7. Thoát");
            System.out.print("Chọn một chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    editBook();
                    break;
                case 3:
                    displayBooks();
                    break;
                case 4:
                    findOldestBook();
                    break;
                case 5:
                    findBookByPrice();
                    break;
                case 6:
                    sortBooks();
                    break;
                case 7:
                    System.out.println("Thoát chương trình...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }

    // Thêm sách mới
    private static void addBook() {
        System.out.print("Nhập mã sách: ");
        int maSach = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        String tenSach = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String tenTacGia = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tóm tắt nội dung: ");
        String tomTatNoiDung = scanner.nextLine();
        System.out.print("Nhập giá tiền: ");
        double giaTien = scanner.nextDouble();

        books.add(new Book(maSach, tenSach, tenTacGia, namSanXuat, tomTatNoiDung, giaTien));
        System.out.println("Đã thêm sách mới thành công!");
    }

    // Chỉnh sửa thông tin sách
    private static void editBook() {
        System.out.print("Nhập mã sách cần chỉnh sửa: ");
        int maSach = scanner.nextInt();
        scanner.nextLine();

        for (Book book : books) {
            if (book.getMaSach() == maSach) {
                System.out.print("Nhập tên sách mới: ");
                book.setTenSach(scanner.nextLine());
                System.out.print("Nhập tên tác giả mới: ");
                book.setTenTacGia(scanner.nextLine());
                System.out.print("Nhập năm sản xuất mới: ");
                book.setNamSanXuat(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Nhập tóm tắt nội dung mới: ");
                book.setTomTatNoiDung(scanner.nextLine());
                System.out.print("Nhập giá tiền mới: ");
                book.setGiaTien(scanner.nextDouble());

                System.out.println("Đã cập nhật thông tin sách.");
                return;
            }
        }
        System.out.println("Không tìm thấy sách với mã này.");
    }

    // Hiển thị danh sách sách
    private static void displayBooks() {
        for (Book book : books) {
            book.display();
        }
    }

    // Tìm cuốn sách lâu đời nhất
    private static void findOldestBook() {
        Book oldestBook = books.stream().min(Comparator.comparingInt(Book::getNamSanXuat)).orElse(null);
        if (oldestBook != null) {
            System.out.println("Cuốn sách lâu đời nhất:");
            oldestBook.display();
        } else {
            System.out.println("Không có sách trong danh sách.");
        }
    }

    // Tìm sách theo giá tiền
    private static void findBookByPrice() {
        System.out.print("Nhập giá tiền yêu cầu: ");
        double targetPrice = scanner.nextDouble();

        System.out.println("Các cuốn sách phù hợp:");
        books.stream().filter(book -> book.getGiaTien() <= targetPrice).forEach(Book::display);
    }

    private static void sortBooks() {
        System.out.println("Chọn cách sắp xếp:");
        System.out.println("1. Theo tên");
        System.out.println("2. Theo giá tiền");
        int choice = scanner.nextInt();

        if (choice == 1) {
            books.sort(Comparator.comparing(Book::getTenSach));
            System.out.println("Đã sắp xếp theo tên sách.");
        } else if (choice == 2) {
            books.sort(Comparator.comparingDouble(Book::getGiaTien));
            System.out.println("Đã sắp xếp theo giá tiền.");
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }
}
