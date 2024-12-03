package Buoi8;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthServiceImpl authService = new AuthServiceImpl();

        AccountService accountService = new AccountServiceImpl();
        Account currentUser = null;

        while (true) {
            if (currentUser == null) {
                System.out.println("=== MENU ===");
                System.out.println("1. Đăng nhập");
                System.out.println("2. Thoát");
                System.out.print("Chọn: ");
                int choice = Integer.parseInt(scanner.nextLine());


                if (choice == 1) {
                    authService.login(scanner);

                } else if (choice == 2) {
                    System.out.println("Thoát chương trình.");
                    break;
                } else {
                    System.out.println("Lựa chọn không hợp lệ.");
                }
            } else {
                if (currentUser.getRole() == Role.ADMIN) {
                    adminMenu(scanner, accountService, authService, currentUser);
                } else {
                    userMenu(scanner, authService, currentUser);
                }
            }
        }

        scanner.close();
    }

    private static void adminMenu(Scanner scanner, AccountService accountService, AuthService authService, Account currentUser) {
        System.out.println("=== ADMIN MENU ===");
        System.out.println("1. Xem danh sách tài khoản");
        System.out.println("2. Tạo tài khoản mới");
        System.out.println("3. Tìm kiếm tài khoản theo username");
        System.out.println("4. Xóa tài khoản");
        System.out.println("5. Thay đổi trạng thái tài khoản");
        System.out.println("6. Xem thông tin cá nhân");
        System.out.println("7. Đăng xuất");
        System.out.print("Chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.println("Danh sách tài khoản:");
                List<Account> accounts = accountService.getAllAccount();
                accounts.forEach(System.out::println);
                break;
            case 2:
                System.out.print("Nhập username: ");
                String username = scanner.nextLine();
                System.out.print("Nhập mật khẩu: ");
                String password = scanner.nextLine();
                Account newAccount = new Account("auto_id", "New User", 20, new Address("Street", "City"), "2000-01-01",
                        username, password, Role.USER, Status.ACTIVE);
                accountService.createNewAccount(newAccount);
                System.out.println("Tạo tài khoản mới thành công.");
                break;
            case 3:
                System.out.print("Nhập username cần tìm: ");
                String searchUsername = scanner.nextLine();
                Account account = accountService.getAccountByUsername(searchUsername);
                if (account != null) {
                    System.out.println("Tài khoản tìm thấy: " + account);
                } else {
                    System.out.println("Không tìm thấy tài khoản.");
                }
                break;
            case 4:
                System.out.print("Nhập username cần xóa: ");
                String deleteUsername = scanner.nextLine();
                accountService.deleteAccount(deleteUsername);
                System.out.println("Xóa tài khoản thành công.");
                break;
            case 5:
                System.out.print("Nhập username cần thay đổi trạng thái: ");
                String statusUsername = scanner.nextLine();
                System.out.print("Nhập trạng thái mới (ACTIVE/BAN): ");
                Status newStatus = Status.valueOf(scanner.nextLine().toUpperCase());
                accountService.changeStatus(statusUsername, newStatus);
                System.out.println("Thay đổi trạng thái thành công.");
                break;
            case 6:
                System.out.println("Thông tin cá nhân:");
                System.out.println(currentUser);
                break;
            case 7:
                authService.logout();
                currentUser = null;
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private static void userMenu(Scanner scanner, AuthService authService, Account currentUser) {
        System.out.println("=== USER MENU ===");
        System.out.println("1. Đổi mật khẩu");
        System.out.println("2. Xem thông tin cá nhân");
        System.out.println("3. Đăng xuất");
        System.out.print("Chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Nhập mật khẩu cũ: ");
                String oldPassword = scanner.nextLine();
                System.out.print("Nhập mật khẩu mới: ");
                String newPassword = scanner.nextLine();
                authService.changePassword(currentUser.getUsername(), oldPassword, newPassword);
                break;
            case 2:
                System.out.println("Thông tin cá nhân:");
                System.out.println(currentUser);
                break;
            case 3:
                authService.logout();
                currentUser = null;
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }
}

