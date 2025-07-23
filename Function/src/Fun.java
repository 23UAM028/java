import java.util.Scanner;

public class Fun {
	public static void printMyname(String name) {
		System.out.println(name);
		return;
		}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String name=sc.next();
			
			printMyname(name);
		}

	}

}
