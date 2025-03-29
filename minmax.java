
import java.util.*;

class minmax {

    public static void main(String ar[]) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int i = 1; i < 5; i++) {
            if (a[i] < min) {
                int temp = a[i];
                a[i] = min;
                min = temp;
            }
        }
        System.out.println("Minimum element= " + min);
        int max = a[0];
        for (int i = 1; i < 5; i++) {
            if (a[i] > max) {
                int temp = a[i];
                a[i] = max;
                max = temp;
            }
        }
        System.out.println("Minimum element= " + max);
    }
}
