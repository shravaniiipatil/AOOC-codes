import java.io.*;
public class FileAnalysis {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the file name.");
            return;
        }
        String fileName = args[0];
        int vowelCount = 0, wordCount = 0, aCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (char ch : line.toCharArray()) {
                    if ("AEIOUaeiou".indexOf(ch) != -1) {
                        vowelCount++;
                    }
                    if (ch == 'a' || ch == 'A') {
                        aCount++;
                    }
                }
                wordCount += line.split("\\s+").length;
            }
            System.out.println("Vowels: " + vowelCount);
            System.out.println("Words: " + wordCount);
            System.out.println("'a' count: " + aCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
