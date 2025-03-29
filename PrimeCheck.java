
public class PrimeCheck {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single integer as a command line argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
