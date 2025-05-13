import java.net.*;
import java.io.*;
class tcpserversum {
public static void main(String args[]) {
try {
ServerSocket ss = new ServerSocket(1520);
System.out.println("Server is waiting for client...");
Socket s = ss.accept();
System.out.println("Client connected.");
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
int num1 = dis.readInt();
int num2 = dis.readInt();
int sum = num1 + num2;
dos.writeInt(sum);
System.out.println("Processed sum: " + sum);
s.close();
ss.close();
} catch (Exception e) {
System.out.println("Server Error: " + e);
}
}
}
