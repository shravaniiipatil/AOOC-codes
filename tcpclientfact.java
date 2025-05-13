import java.util.*;
import java.net.*;
import java.io.*;
class tcpclientfact {
public static void main(String args[]) {
try {
Socket s1 = new Socket("localhost", 1520);
DataInputStream dis = new DataInputStream(s1.getInputStream());
DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
Scanner sc = new Scanner(System.in);
while (true) {
System.out.print("Enter a number (or -1 to stop): ");
int num = sc.nextInt();
dos.writeInt(num); 
if (num == -1) break;
int result = dis.readInt(); 
System.out.println("Factorial received from server: " + result);
}
s1.close();
} catch (Exception e) {
System.out.println("Client Error: " + e);
}
}
}
