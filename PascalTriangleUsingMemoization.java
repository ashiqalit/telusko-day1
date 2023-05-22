import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PascalTriangleUsingMemoization {
	private static Map<String,Long>cache=new HashMap<>();
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

    public static long pascalView(int row, int col) {
    	String key=row + "-" + col;
    	if(cache.containsKey(key))
    		return cache.get(key);
        if (col == 0 || col == row)
            return 1;
        	long result=pascalView(row - 1, col - 1) + pascalView(row - 1, col);
            cache.put(key,result);
        	return result;
        
    }
}
