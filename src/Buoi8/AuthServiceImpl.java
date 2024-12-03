package Buoi8;
import Buoi7.model.User;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.HashMap;



public  class AuthServiceImpl implements AuthService {
    private final HashMap<String, Account> accounts = new HashMap<>();
    private Account currentAccount;
    @Override

    public void login(Scanner scanner) {
        ArrayList<Account> accounts1 = new ArrayList<>();
        accounts1.add(new Account("user1","12345",Role.ADMIN,Status.ACTIVE));
        accounts1.add(new Account("user2","12346",Role.USER,Status.BAN)) ;
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        Account loggedInUser = null;

        for (Account account : accounts1) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                loggedInUser = account;
                break;
            }
        }

        if (loggedInUser == null) {
            System.out.println("Tên đăng nhập hoặc mật khẩu không đúng!");
            return;
        }
    }

    @Override
    public void logout() {
        if (currentAccount != null) {
            System.out.println("Logout successful!");
            currentAccount = null;
        } else {
            System.out.println("No account is logged in.");
        }
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        Account account = accounts.get(username);
        if (account != null && account.getPassword().equals(oldPassword)) {
            account.setPassword(newPassword);
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Incorrect old password.");
        }
    }
}

















