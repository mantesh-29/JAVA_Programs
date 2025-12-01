package ELC;
import BLC.FullTimeEmployee;
import BLC.PartTimeEmployee;
public class EmployeeSalary {

	public static void main(String[] args) {
		System.out.println("=========Salary Calculation Menu=============");
		IO.println("1 ) FullTime Employees");
		IO.println("2 ) PartTime Employees");
		System.out.println("=========Salary Calculation Menu=============");
		int choice = Integer.parseInt(IO.readln());
		switch(choice) {
		case 1->{
			IO.print("Enter Fulltime Employee ID : ");
			int id = Integer.parseInt(IO.readln());
			IO.print("Enter Fulltime Employee Name : ");
			String name = IO.readln();
			IO.print("Enter the Salary : ");
			double salary = Double.parseDouble(IO.readln());
			FullTimeEmployee ftEmloyee= new FullTimeEmployee(id,name,salary); 
			double totalSalary = ftEmloyee.calculateSalary();
			IO.println(name+" Salary is :"+totalSalary);
			//FullTimeEmployee.FullTimeEmployee(id,name,salary);
			
		}
		case 2 ->{
			IO.print("Enter Parttime Employee ID : ");
			int id = Integer.parseInt(IO.readln());
			IO.print("Enter parttime Employee Name : ");
			String name = IO.readln();
			IO.println("Enter your hourly rate : ");
			double hourlyRate = Double.parseDouble(IO.readln());
			IO.print("Enter your total works hour in the month : ");
			int workHour = Integer.parseInt(IO.readln());
			PartTimeEmployee ptEmployee = new PartTimeEmployee(id,name,hourlyRate,workHour);
			double totalSal = ptEmployee.calculateSalary();
			IO.println(name + " Salary is :"+totalSal);
			
			
		}
		}

	}

}
