package Buoi8;

import java.util.List;

public interface AccountService {
    public List<Account> getAllAccount();
    public void createNewAccount(Account account);
    public Account getAccountByUsername(String username);
    public void deleteAccount(String username);
    public void changeStatus(String username, Status status);

}
