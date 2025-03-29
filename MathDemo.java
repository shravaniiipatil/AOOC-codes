import MathOperations.MathFunctions;
import java.util.Scanner;

class MathDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        sc.close();

        System.out.println("Floor Value: " + MathFunctions.floorValue(num));
        System.out.println("Ceil Value: " + MathFunctions.ceilValue(num));
        System.out.println("Rounded Value: " + MathFunctions.roundValue(num));
    }
}
