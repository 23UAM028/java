
public class Program {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("tonny");
		System.out.println(sb);
		
		
		//char at index 0
		System.out.println(sb.charAt(4));
		
		//set char at index
		sb.setCharAt(1, 'p');
		System.out.println(sb);
		
		//insert
		sb.insert(0, 's');
		
		System.out.println(sb);
		
		//delete the extra s
		sb.delete(0, 1);
		System.out.println(sb);
	}

}
