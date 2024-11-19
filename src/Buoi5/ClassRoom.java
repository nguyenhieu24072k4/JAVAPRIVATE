package Buoi5;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
    private ArrayList<Student> students = new ArrayList<>();

    public void inputList() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Student s = new Student();
            s.input();
            if (s.getId() == 555) break; // Stop input if ID is 555
            students.add(s);
        }
    }

    public void outputList() {
        System.out.printf("%-10s %-15s %-10s %-10s %-5s\n", "ID", "Class", "GPA", "Name", "Age");
        for (Student s : students) {
            s.output();
        }
    }

    public void sortByGpa() {
        students.sort((s1, s2) -> Float.compare(s1.getGpa(), s2.getGpa()));
    }

    public void removeById(int id) {
        students.removeIf(s -> s.getId() == id);
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Input Students");
            System.out.println("2. Display Students");
            System.out.println("3. Sort by GPA");
            System.out.println("4. Remove by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> inputList();
                case 2 -> outputList();
                case 3 -> {
                    sortByGpa();
                    System.out.println("Sorted by GPA.");
                }
                case 4 -> {
                    System.out.print("Enter ID to remove: ");
                    int id = sc.nextInt();
                    removeById(id);
                    System.out.println("Student removed.");
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();
        classRoom.menu();
    }
}

