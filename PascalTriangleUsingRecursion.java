import java.util.Scanner;

public class PascalTriangleUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int numOfLines = sc.nextInt();
        for (int i = 0; i < numOfLines; i++) {
            for (int j = 0; j < numOfLines-i; j++) {
                System.out.print(" "); // Add space for left alignment
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d", pascalView(i, j)); // Adjust spacing for alignment
            }
            System.out.println();
        }
    }

    public static int pascalView(int row, int col) {
        if (col == 0 || col == row)
            return 1;
        else {
            int left = pascalView(row - 1, col - 1);
            int right = pascalView(row - 1, col);
            return left + right;
        }
    }
}
