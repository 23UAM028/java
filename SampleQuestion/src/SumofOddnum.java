import java.util.Scanner;

public class SumofOddnum {
	
	public static void printsum(int n) {
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				sum=sum +i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			printsum(n);
		}
		
	}

}
