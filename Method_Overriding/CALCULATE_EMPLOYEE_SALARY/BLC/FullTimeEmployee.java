package BLC;

 public class FullTimeEmployee extends Employee{
	protected double salary;

	public FullTimeEmployee(int id, String name,double salary) {
		super(id, name);
		this.salary = validateSalary(salary);
		
	}
	public double validateSalary(double salary) {
		if(salary <= 0 ) {
			System.err.println("Salary can't be negative!!!");
			System.exit(0);
			return 0.0;
		}
		else {
			return salary;
		}
	}
	@Override
	public double calculateSalary() {
		double totalSalary= salary;
		return totalSalary;
		
	}

}
