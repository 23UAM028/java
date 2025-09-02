
public class Person {

	private String name;
	private int age;
	public  Person(){
		

	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
   public void showRecord() {
	   System.out.println("name:"+name);
	   System.out.println("age:"+age);

   }
   
   
}
 class Employee {
		private String name;
		private int age;
		private int empoid;
		private int salary;
		
		public  Employee(){
			

		}
	
 public Employee(String name,int age,int empoid,int salary) {
		this.name=name;
		this.age=age;
		this.empoid=empoid;
		this.salary=salary;
 }	
 public void printRecord() {
	   System.out.println("name:"+name);
	   System.out.println("age:"+age);
	   System.out.println("empoid:"+empoid);
	   System.out.println("salary:"+salary);
 }
		
 }		
		
 public class Person {

		public static void main(String[] args) {
			Employee emp2=new Employee(Dikshant,20,1,50000);
			emp2.printRecord();
		}
		public static void main1(String[] args) {
			
			Person p2=new Person(Dikshant,20);
			p2.showRecord();
			
		}
}
		