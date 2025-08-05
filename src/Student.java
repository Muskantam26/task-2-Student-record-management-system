import java.util.ArrayList;
import java.util.Scanner;


class StudentRecord{
    private int id;
    private String name;
    private double marks;

    //POJO (Plain Old Java Object) for student data
    public StudentRecord(int id, String name, double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setMarks(double marks){
        this.marks=marks;
    }

    public void display(){
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);

    }
}


public class Student {
    private static ArrayList<StudentRecord> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== Student Record Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }

    //add student
    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Marks: ");
        double marks = sc.nextDouble();

        students.add(new StudentRecord(id, name, marks));
        System.out.println("Student added successfully.");
    }

    //view students
    private static void viewStudents() {


        if (students.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println("Student Records:");
            for (StudentRecord s : students) {
                s.display();
            }
        }
    }

    //update
    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();

        boolean found = false;

        for (StudentRecord s : students) {
            if (s.getId() == id) {
                sc.nextLine(); // consume newline
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                System.out.print("Enter new marks: ");
                double marks = sc.nextDouble();
                s.setName(name);
                s.setMarks(marks);
                System.out.println("Student record updated.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    //delete
    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        boolean removed = students.removeIf(s -> s.getId() == id);

        if (removed) {
            System.out.println("Student record deleted.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}

