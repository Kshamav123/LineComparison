package lineproblem;
import java.util.Scanner;

public class LC_UC3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" FOR LINE 1: ");
		System.out.println("Enter the first x co-ordinate value (x1): "); 
		double Ax1= scanner.nextInt(); 
		System.out.println("Enter the first y co-ordinate value (y1): "); 
		double Ay1= scanner.nextInt(); 
		System.out.println("Enter the second x co-ordinate value (x2): "); 
		double Ax2= scanner.nextInt(); 
		System.out.println("Enter the second y co-ordinate value (y2): "); 
		double Ay2= scanner.nextInt();
		double Ax = Ax2 - Ax1;
		double Ay = Ay2 - Ay1;
		double length1 = (int) Math.sqrt((Math.pow(Ax,2)) + (Math.pow(Ay,2)));
		Double l1 = new Double(length1);
		
		
		System.out.println(" FOR LINE 2: ");
		System.out.println("Enter the first x co-ordinate value (x1): "); 
		double Bx1= scanner.nextInt(); 
		System.out.println("Enter the first y co-ordinate value (y1): "); 
		double By1= scanner.nextInt(); 
		System.out.println("Enter the second x co-ordinate value (x2): "); 
		double Bx2= scanner.nextInt(); 
		System.out.println("Enter the second y co-ordinate value (y2): "); 
		double By2= scanner.nextInt();
		double Bx = Bx2 - Bx1;
		double By = By2 - By1;
		double length2 = (int) Math.sqrt((Math.pow(Bx,2)) + (Math.pow(By,2)));
		Double l2 = new Double(length2);
		scanner.close();
		
		
		int result = l1.compareTo(l2);
		if(result>0)
			System.out.println("The length of Line 1 is greater than Line 2.");
		else if(result<0)
			System.out.println("The length of Line 1 is lesser than Line 2.");
		else
			System.out.println("The length of the lines are equal.");
		
		System.out.println(" The length of the line 1: " + length1);
		System.out.println(" The length of the line 2: " + length2);

	}

}


