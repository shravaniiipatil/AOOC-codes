import mathpackage.Statistics;
import mathpackage.convert.Converter;

public class decimalmain {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + Statistics.factorial(5));
        System.out.println("Cube of 4: " + Statistics.cube(4));

        System.out.println("Decimal 10 to Binary: " + Converter.decimalToBinary(10));
        System.out.println("Decimal 10 to Octal: " + Converter.decimalToOctal(10));
        System.out.println("Decimal 10 to Hex: " + Converter.decimalToHex(10));

        System.out.println("Binary '1010' to Decimal: " + Converter.binaryToDecimal("1010"));
        System.out.println("Octal '12' to Decimal: " + Converter.octalToDecimal("12"));
        System.out.println("Hex 'A' to Decimal: " + Converter.hexToDecimal("A"));
    }
}