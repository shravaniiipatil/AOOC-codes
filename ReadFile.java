import java.io.*;
public class ReadFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\patil\\Desktop\\Name.txt"; 
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
