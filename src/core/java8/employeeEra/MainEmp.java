package core.java8.employeeEra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 8000));
        empList.add(new Employee("Nagesh Y", "Admin", 15000));
        empList.add(new Employee("Vasu V", "Security", 2500));
        empList.add(new Employee("Amar", "Entertinment", 12500));
		
        empList.stream().filter(emp->emp.getSalary() > 10000).forEach(System.out::println);
	}

}
