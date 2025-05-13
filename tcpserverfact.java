import java.net.*;
import java.io.*;
class tcpserverfact {
public static void main(String args[]) {
try {
ServerSocket ss = new ServerSocket(1520);
System.out.println("Server is running...");
Socket s = ss.accept();
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
while (true) {
int num = dis.readInt(); 
if (num == -1) {
System.out.println("Client requested to stop.");
break;
}
int fact = 1;
for (int i = 1; i <= num; i++) {
fact *= i;
}
dos.writeInt(fact);             }
s.close();
ss.close();
} catch (Exception e) {
System.out.println("Server Error: " + e);
}
}
}
