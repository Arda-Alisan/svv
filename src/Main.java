import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static class Contact {
        String name;
        int age;

        Contact(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "👤 Name: " + name + " | Age: " + age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n📒 People Management System");
            System.out.println("1. Add new person");
            System.out.println("2. List all persons");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // dummy newline

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // dummy newline
                    contacts.add(new Contact(name, age));
                    System.out.println("✅ Person added!");
                    break;
                case 2:
                    System.out.println("\n👥 Persons:");
                    for (Contact c : contacts) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    System.out.println("👋 Exiting the program...");
                    break;
                default:
                    System.out.println("⚠️ Invalid selection!");
            }

        } while (choice != 3);
    }
}
