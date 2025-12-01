package BLC;

public class PartTimeEmployee extends Employee{
	 protected double hourlyRate;
	  protected int hoursWorked;
	  public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
		super(id, name);
		this.hourlyRate = validateHourlyRate(hourlyRate);
		this.hoursWorked = validateWorkHour(hoursWorked);
	  } 
	  public double validateHourlyRate(double hourlyRate) {
		  if(hourlyRate <=0) {
			  IO.print("Employee hourly rate can't be zero OR Negative");
			  System.exit(0);
			  return 0.0;
		  }
		  else {
			  return hourlyRate;
		  }
	  }
	  public int validateWorkHour(int hoursWorked) {
		  if(hoursWorked <= 0) {
			  IO.print("Employee hours of work can't be Negative");
			  System.exit(0);
			  return 0;
		  }
		  else {
			  return hoursWorked;
		  }
	  }
	  @Override
	  public double calculateSalary() {
		  double totalSalary = hoursWorked * hourlyRate;
		  return totalSalary;
	  }

}
