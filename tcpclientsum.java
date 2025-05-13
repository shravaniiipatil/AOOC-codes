import java.net.*;
import java.io.*;
import java.util.*;
class tcpclientsum {
public static void main(String args[]) {
try {
Socket s = new Socket("localhost", 1520);
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
DataInputStream dis = new DataInputStream(s.getInputStream());
Scanner sc = new Scanner(System.in);
System.out.print("Enter first number: ");
int num1 = sc.nextInt();
System.out.print("Enter second number: ");
int num2 = sc.nextInt();
dos.writeInt(num1);
dos.writeInt(num2);
int sum = dis.readInt();
System.out.println("Sum received from server: " + sum);
s.close();
} catch (Exception e) {
System.out.println("Client Error: " + e);
}
}
}
