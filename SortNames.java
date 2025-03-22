
import java.util.Scanner;

class SortNames {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] names = new String[10];

        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = s.nextLine();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (names[i].compareToIgnoreCase(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("\nNames in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }

        s.close();
    }
}
