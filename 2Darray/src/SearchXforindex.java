import java.util.Scanner;

public class SearchXforindex {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		int row=sc.nextInt();
		int colu=sc.nextInt();
		
		int[][] numbers=new int[row][colu];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<colu;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		
		int x=sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<colu;j++) {
				if(numbers[i][j]==x) {
					System.out.println("x found at index:(" + i +","+ j +")");
				}
			}
		}
		
	}

}
