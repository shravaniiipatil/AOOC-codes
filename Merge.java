
import java.util.*;

class Merge {

    public static void main(String ar[]) {
        try (Scanner sc = new Scanner(System.in)) {

            int a[] = new int[3];
            System.out.println("Enter elements of array1: ");
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }

            int b[] = new int[4];
            System.out.println("Enter elements of array2: ");
            for (int j = 0; j < 4; j++) {
                b[j] = sc.nextInt();
            }

            int c[] = new int[7];
            int i = 0, j = 0, k = 0;

            while (i < 3 && j < 4) {
                if (a[i] < b[j]) {
                    c[k] = a[i];
                    i++;
                } else {
                    c[k] = b[j];
                    j++;
                }
                k++;
            }

            while (i < 3) {
                c[k] = a[i];
                i++;
                k++;
            }

            while (j < 4) {
                c[k] = b[j];
                j++;
                k++;
            }

            System.out.println("Sorted array is:");
            for (i = 0; i < 7; i++) {
                System.out.print(c[i] + " ");
            }
        }
    }
}
