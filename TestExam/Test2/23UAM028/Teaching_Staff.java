
public class Teaching_Staff extends Staff {
     private double noOfHours;
     private double chargePerHour;
     
     Teaching_Staff( int id,String name,double noOfHours,double chargePerHour){
    	 super(id,name);
    	 this.noOfHours=noOfHours;
    	 this.chargePerHour=chargePerHour;
     }
     
     
	 public double getNoOfHours() {
		 return noOfHours;
	 }
	 public void setNoOfHours(double noOfHours) {
		 this.noOfHours = noOfHours;
	 }
	 public double getChargePerHour() {
		 return chargePerHour;
	 }
	 public void setChargePerHour(double chargePerHour) {
		 this.chargePerHour = chargePerHour;
	 }
	 @Override
	 public String toString() {
		return "\nName:"+ getName()+"id"+getId() +"noOfHours"+getNoOfHours() +"chargePerHour"+getChargePerHour();
	 }
	
}
