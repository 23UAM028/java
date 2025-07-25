import java.util.Scanner;

public class Radius {
	
	public static double Circumference(Double radius) {
		
		return 2*3.14*radius;
	}
	

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number:");
			Double radius=sc.nextDouble();
			System.out.println(Circumference(radius));
		}
		

	}

}
