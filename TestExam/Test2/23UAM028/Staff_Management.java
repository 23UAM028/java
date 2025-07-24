import java.util.Scanner;

public class Staff_Management {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		int count=0;
		Staff[] arr=new Staff[n];
		
		while(true) {
			System.out.println("1. Add Teaching staff.\n2. Add Lab staff.\n3. Display all Teaching staff."
					+ "\n 4. Display All Lab staff.\n 5. Find specific teaching staff."
					+ "\n 6. Find specific lab staff.\r\n"
					+ "7. Display teaching staff who worked for highest hours.\n8. Display lab staff who have lowest salary");
			
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
			if(count<arr.length) {
				
				System.out.println("Enter the id:" );
				 int id=sc.nextInt();
				 sc.nextLine();
				 
				 System.out.println("Enter name");
				 String name=sc.nextLine();
				 
				 System.out.println("Enter noofHour:");
				 double noOfHours=sc.nextDouble();
				 sc.nextLine();
				 
				 System.out.println("Enter chargePerHour");
				 double chargePerHour=sc.nextDouble();
	             if( noOfHours  >0 && 0<chargePerHour )
	            System.out.println("system chargePerHour and noOfHourse same");
				
				Teaching_Staff t=new Teaching_Staff(id,name,noOfHours,chargePerHour);
				arr[n++]=t;
				System.out.println("LAb satff added succefully");
			}else {
				System.out.println("Lab satff is Full");
			}
			case2:
				 if(count<arr.length) {
					 System.out.println("Enter the id:" );
					 int id1=sc.nextInt();
					 sc.nextLine();
					 
					 System.out.println("Enter name");
					 String name1=sc.nextLine();
					 
					 System.out.println("Enter Salary:");
					 double salary11=sc.nextDouble();
					
					
				 
				 
			LabStaff l=new LabStaff(id1,name1,salary11);
			arr[n++]=l;
			System.out.println("Lab staff added succefully");
		 }else {
			 
		 }
			
			
			
			
		case 3:
			System.out.println("Enter teaching Staff");
			for(Staff s:arr) {
				if(s instanceof Teaching_Staff)
					System.out.println(s);
			}
		case 4:
			System.out.println("Enter all labsatff");
			for(Staff s:arr) {
				if(s instanceof LabStaff)
				System.out.println(s);
			}
		case 5:
			System.out.println("Enter teaching staff");
			int id =sc.nextInt();
			boolean fn=false;
			for(Staff s:arr) {
			if(s instanceof Teaching_Staff && s.getId()==id) {
				System.out.println(s);
				fn =true;
				break;
			}
			
			}
			if(!fn)System.out.println("Staff not found");
			break;
		case 6:
			System.out.println("Enter lab staff");
			int lid =sc.nextInt();
			boolean fn1=false;
			for(Staff s:arr) {
			
			if(s instanceof LabStaff && s.getId()==lid) {  
				System.out.println(s);
				fn =true;
				break;	
			}
			
			}
			if(!fn1)System.out.println("Staff not found");
			break; 
			
		case 7:
			Teaching_Staff max=null;
			for(Staff s:arr) {
             if(s instanceof Teaching_Staff ) {
            	 Teaching_Staff t=(Teaching_Staff )s;
            	 if(t.getNoOfHours()>max.getNoOfHours())
            		 max=t;
             }
            	 
             }
			if(max !=null)
				System.out.println("teaching staff with highest hourse:"+max);
			else
				System.out.println("not found");
			break;
			
		case 8:
			LabStaff min=null;
			for(Staff s:arr) {
				 if(s instanceof LabStaff ) {
					 LabStaff t=(LabStaff) s;
					 min=t;
				 }
			}
			
			if(min !=null)
				System.out.println("LabStaff staff with highest hourse:"+min);
			else
				System.out.println("not found");
			break;
			
		}
		

	}
	
}

	
	}

	


	
