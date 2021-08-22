package lineproblem;

import java.util.Scanner;

public class LC_UC2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the values of Line A of Point 1 x co-ordinate:");
		double Ax1 = scanner.nextFloat();

		System.out.println("Enter the values of Line A of Point 2 x co-ordinate:");
		double Ax2 = scanner.nextFloat();

		System.out.println("Enter the values of Line A of Point 1 y co-ordinate:");
		double Ay1 = scanner.nextFloat();

		System.out.println("Enter the values of Line A of Point 2 y co-ordinate:");
		double Ay2 = scanner.nextFloat();

		double lengthA = Math.sqrt((Ax2 - Ax1) * (Ax2 - Ax1) + (Ay2 - Ay1) * (Ay2 - Ay1));

		System.out.println("The distance between two points:" + lengthA);

		System.out.println("Enter the values of Line B of Point 1 x co-ordinate:");
		double Bx1 = scanner.nextFloat();

		System.out.println("Enter the values of Line B of Point 2 x co-ordinate:");
		double Bx2 = scanner.nextFloat();

		System.out.println("Enter the values of Line B of Point 1 y co-ordinate:");
		double By1 = scanner.nextFloat();

		System.out.println("Enter the values of Line B of Point 2 y co-ordinate:");
		double By2 = scanner.nextFloat();
		scanner.close();

		double lengthB = Math.sqrt((Bx2 - Bx1) * (Bx2 - Bx1) + (By2 - By1) * (By2 - By1));

		System.out.println("The distance between two points:" + lengthB);

		if (lengthA == lengthB)

			System.out.println("The two lines are equal");
		else
			System.out.println("The two lines are not equal");
	}

}
