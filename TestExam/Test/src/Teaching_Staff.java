
public class Teaching_Staff {
     private double noOfHours;
     private double chargePerHour;
     
     Teaching_Staff(double noOfHours,double chargePerHour){
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
		return "Teaching_Staff [noOfHours=" + noOfHours + ", chargePerHour=" + chargePerHour + "]";
	 }
	
}
