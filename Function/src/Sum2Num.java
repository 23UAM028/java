import java.util.Scanner;

public class Sum2Num {
	public static int Calculatesum(int a,int b) {
		int sum=a+b;
		return sum;
		
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			int sum=Calculatesum(a, b);
			System.out.println("Sum of 2 number:"+sum);
		}

	}

}
