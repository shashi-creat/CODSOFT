import java.util.Scanner;

class Student {
    int id;
    String name;
    float marks;
    String address;
    String college;
    String phone;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter College: ");
        college = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Address: " + address);
        System.out.println("College: " + college);
        System.out.println("Phone: " + phone);
    }
}

public class Task5_StudentManagement {
    public static void main(String[] args) {
        Student s = new Student();

        s.input();
        s.display();
    }
}