import java.io.*;
import java.util.Scanner;
class FileAppend {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            Scanner sc = new Scanner(System.in);
            String option;
            System.out.println("Do you want to add data? (Yes/No)");
            option = sc.next();
            if (option.equalsIgnoreCase("Yes")) {
                fr.close();
                FileWriter fw = new FileWriter(args[0], true);
                System.out.println("Enter data to add in file:");
                String str1;
                sc.nextLine();  
                do {
                    str1 = sc.nextLine();
                    if (!str1.equals("exit")) {
                        fw.write(str1 + System.lineSeparator());                      
                    }
                } while (!str1.equals("exit"));
                fw.close(); 
                System.out.println("Data has been appended to the file.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
