
import java.util.Scanner;

class palindrome {

    public static void main(String ar[]) {
        int num, temp, r, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }

        if (temp == sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
