import java.util.Scanner;

public class Greater2num {
	
	public static int greaternum(int a,int b) {
		
		if(a>b) {
			System.out.print("Then a is greater:");
			return a;
		}else {
			System.out.print("Then b is greater:");

			return b;
		}
			
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter first number:");
			int a=sc.nextInt();
			System.out.print("Enter second number:");
			int b=sc.nextInt();
			System.out.println(greaternum(a,b));
		}
	}

}
