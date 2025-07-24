
public class LabStaff extends Staff { 
	
	private double salary1;


	public LabStaff(int id, String name,double salary1) {
		super(id, name);
		this.salary1=salary1;
	} 
	
	
	
	 public double getSalary() {
		return salary1;
	}

	public void setSalary(double salary) {
		this.salary1 = salary;
	}

	@Override
	public String toString() {
		return " \"\\nName:\"+ getName()+\"id\"+getId() [salary1=" + salary1 + ", getSalary()=" + getSalary() + "]";
	}

}
