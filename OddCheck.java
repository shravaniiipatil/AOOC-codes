import java.util.*;
class OddNumberException extends Exception {
    OddNumberException(String msg) {
        super(msg);
    }
}
public class OddCheck {
    static void checkEven(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd: " + num);
        } else {
            System.out.println("Number is even: " + num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        try {
            checkEven(number);
        } catch (OddNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        sc.close();
    }
}
