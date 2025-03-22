
import java.util.*;

class sum1to10 {

    public static void main(String ar[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of 1 to 10= " + sum);
    }
}
