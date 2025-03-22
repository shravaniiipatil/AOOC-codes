
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] sum = new int[3][3];
        int[][] sub = new int[3][3];
        int[][] product = new int[3][3];
        int[][] transpose = new int[3][3];

        System.out.println("Enter elements of First Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Second Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Transpose of Product Matrix");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition of two matrices:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        sum[i][j] = matrix1[i][j] + matrix2[i][j];
                        System.out.print(sum[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("Subtraction of two matrices:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        sub[i][j] = matrix1[i][j] - matrix2[i][j];
                        System.out.print(sub[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("Multiplication of two matrices:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        product[i][j] = 0;
                        for (int k = 0; k < 3; k++) {
                            product[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(product[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;

            case 4:
                System.out.println("Transpose of Product Matrix:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        product[i][j] = 0;
                        for (int k = 0; k < 3; k++) {
                            product[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        transpose[j][i] = product[i][j];
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(transpose[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }
        sc.close();
    }
}
