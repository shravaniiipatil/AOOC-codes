
import java.util.Scanner;

class Square {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number: ");
        int num = sc.nextInt();
        sc.close();

        int result = num * num;
        System.out.println("Square= " + result);
    }
}
