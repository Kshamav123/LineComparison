package lineproblem;

import java.util.Scanner;

public class LC_UC1 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter the values of Point 1 x co-ordinate:");
		double x1 = scanner.nextFloat();
		
		System.out.println("Enter the values of Point 2 x co-ordinate:");
		double x2 = scanner.nextFloat();
		
		System.out.println("Enter the values of Point 1 y co-ordinate:");
		double y1 = scanner.nextFloat();
		
		System.out.println("Enter the values of Point 2 y co-ordinate:");
		double y2 = scanner.nextFloat();
		scanner.close();
		
		 double distance = Math.sqrt((x2-x1) * (x2-x1)+(y2-y1) * (y2-y1));
		
	System.out.println("The distance between two points:" +distance);

	}

}
