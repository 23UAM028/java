import java.util.Scanner;

public class Mul2num {
	public static int multiply(int a,int b) {
		return a * b;
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			System.out.println("Multiplication of two number:"+multiply( a,b));
		}
		
	}

}
