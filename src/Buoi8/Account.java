package Buoi8;

public class Account extends Person {
    private String username;
    private  String password;
    private Role role;
    private Status status;

    public Account(String autoId, String newUser, int age, Address address, String date, String username, String password, Role user, Status active){

    }

    public Account(String username, String password, Role role, Status status) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public Account(String id, String fullName, int age, String birthday, Address address, String username, String password, Role role, Status status) {
        super(id, fullName, age, birthday, address);
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return super.toString()+ "Acount{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", status=" + status +
                '}';
    }

}
