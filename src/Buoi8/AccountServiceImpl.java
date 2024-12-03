package Buoi8;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private final List<Account> accounts = new ArrayList<>();

    @Override
    public List<Account> getAllAccount() {
        return accounts;
    }

    @Override
    public void createNewAccount(Account account) {
        accounts.add(account);
        System.out.println("New account created successfully!");
    }

    @Override
    public Account getAccountByUsername(String username) {
        return accounts.stream()
                .filter(account -> account.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void deleteAccount(String username) {
        accounts.removeIf(account -> account.getUsername().equals(username));
        System.out.println("Account deleted successfully!");
    }

    @Override
    public void changeStatus(String username, Status status) {
        Account account = getAccountByUsername(username);
        if (account != null) {
            account.setStatus(status);
            System.out.println("Account status updated successfully!");
        }
    }


}
