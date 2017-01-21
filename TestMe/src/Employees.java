import java.util.Scanner;

public class Employees {
	private String Id;
	private String Name;
	private double basicSalary;
	private double houseRent;

	//Initialize all the variables (use parameters as arguments)

	public Employees(String id, String name, double basicSalary, double houseRent) {
		
		Id = id;
		Name = name;
		this.basicSalary = basicSalary;
		this.houseRent = houseRent;
	}
	//•	To  Take input for an employee.
	public void input(Employees emp){
		Scanner sc=new Scanner(System.in);
		emp.Id=sc.nextLine();
		emp.Name=sc.nextLine();
		emp.basicSalary=sc.nextDouble();
		emp.houseRent=sc.nextDouble();
	}


}
