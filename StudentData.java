import java.io.*;
import java.util.Scanner;
public class StudentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        System.out.print("Enter student weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter student height: ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter student city: ");
        String city = scanner.nextLine();
        System.out.print("Enter student phone number: ");
        String phoneNumber = scanner.nextLine();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("studentData.dat"))) {
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(weight);
            dos.writeDouble(height);
            dos.writeUTF(city);
            dos.writeUTF(phoneNumber);
            System.out.println("Student information saved.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("studentData.dat"))) {
            String savedName = dis.readUTF();
            int savedAge = dis.readInt();
            double savedWeight = dis.readDouble();
            double savedHeight = dis.readDouble();
            String savedCity = dis.readUTF();
            String savedPhoneNumber = dis.readUTF();

            System.out.println("\nStudent Information Retrieved:");
            System.out.println("Name: " + savedName);
            System.out.println("Age: " + savedAge);
            System.out.println("Weight: " + savedWeight);
            System.out.println("Height: " + savedHeight);
            System.out.println("City: " + savedCity);
            System.out.println("Phone Number: " + savedPhoneNumber);
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
