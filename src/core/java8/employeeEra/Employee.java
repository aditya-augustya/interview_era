package core.java8.employeeEra;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {

	private String name;
	private String team;
	//private int age; 
	private int salary;
	//private Date joining_date;
	public Employee(String name, String team, int salary) {
		super();
		this.name = name;
		this.team = team;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", team=" + team + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
