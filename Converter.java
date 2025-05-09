package mathpackage.convert;
public class Converter {
    public static String decimalToBinary(int n) {
        return Integer.toBinaryString(n);
    }
    public static String decimalToOctal(int n) {
        return Integer.toOctalString(n);
    }
    public static String decimalToHex(int n) {
        return Integer.toHexString(n).toUpperCase();
    }
    public static int binaryToDecimal(String bin) {
        return Integer.parseInt(bin, 2);
    }
    public static int octalToDecimal(String oct) {
        return Integer.parseInt(oct, 8);
    }
    public static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }
}
