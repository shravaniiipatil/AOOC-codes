
import java.util.Scanner;

class EvenOdd {

    public static void main(String ar[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
