package Buoi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person {
    private ArrayList<Person> list = new ArrayList<>();
    private String CCCD;
    private String name;
    private int age;
    private String address;
    private String sdt;

    public Person() {

    }

    public Person(String CCCD, String name, int age, String address, String sdt) {
        this.CCCD = CCCD;
        this.name = name;
        ;
        this.age = age;
        this.address = address;
        this.sdt = sdt;

    }

    public String getCCCD() {
        return CCCD;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getSdt() {
        return sdt;
    }

    public void setCCCD(String CCCD) {

        this.CCCD = CCCD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void display() {
        System.out.println("ID: " + CCCD);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + age);
        System.out.println("Phone: " + sdt);
    }

    public void addPerson(Person person) {
        list.add(person);
    }

    public Person searchCCCD(String CCCD) {
        for (Person person : list) {
            if (person.getCCCD().equals(CCCD)) {
                return person;
            }
        }
        return null;
    }

    public void sapXepTheoTuoi() {
        Collections.sort(list, Comparator.comparingInt(Person::getAge));
    }

    public static void main(String[] args) {

    }

}
