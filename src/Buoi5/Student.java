package Buoi5;
import java.util.Scanner;

public class Student extends Person {
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2;
    public Student(){
        
    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public Student(int id, String nameClass, float gpa) {
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    @Override
    public String toString() {
        return    super.toString() +
                "id=" + id +
                ", nameClass='" + nameClass + '\'' +
                ", gpa=" + gpa +
                ", criteria=" + criteria +
                '}';

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter class name: ");
        nameClass = sc.nextLine();
        System.out.print("Enter GPA: ");
        gpa = sc.nextFloat();
        super.input();
    }

    public void output() {
        System.out.printf("%-10d %-15s %-10.2f %-10s %-5d\n", id, nameClass, gpa, name, age);
    }

    public boolean checkFall() {
        return gpa < criteria;
    }

    public int getId() {
        return id;
    }

    public float getGpa() {
        return gpa;
    }
}
