import java.util.Scanner;

public class Avgof3num {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter first num:");
			int a=sc.nextInt();
			
			System.out.print("Enter Second num:");
			int b=sc.nextInt();
			
			System.out.print("Enter third num:");
			int c=sc.nextInt();
			
			int avg=(a+b+c)/3;
			System.out.println(avg);
		}
	}

}

