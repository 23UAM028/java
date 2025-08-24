
public class Raggedarray {

	public static void main(String[] args) {
		int [][] arr=new int[4][];
		arr[0]=new int[] {10};
		arr[1]=new int[]{10, 20};
		arr[2]=new int[]{10,20,30};
		arr[3]=new int[]{10,20,30,40};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		

	}

}