package Buoi7.model;

public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private int age;
    private String birth;
    private Role role;

    public User() {
    }

    public User(String id, String name, String email, String password, int age, String birth, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.birth = birth;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birth='" + birth + '\'' +
                ", role=" + role +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }
}