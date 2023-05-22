import java.util.Scanner;

public class PascalTriangleUsingIteration {
public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of lines:");
	int numOfLine=sc.nextInt();
	int space=numOfLine;
	int number=1;
	for(int i=0;i<numOfLine;i++) {
		for(int s=0;s<space;s++) {
			System.out.print(" ");
		}
		number=1;
		for(int j=0;j<=i;j++) {
			System.out.print(number+" ");
			number=number*(i-j)/(j+1);
		}
		space--;
		System.out.println();
	}
}
}
