package core.java8.masterEmp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.gson.Gson;


public class Practice {
	
	static Gson json = new Gson() ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		
		pro3(employeeList);
	}
	
	//System.out::println
	
	public static void pro3(List<Employee> emp){
		
		emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))) ; 
	
		//System.out.println(json.toJson(emp));
		
	}

}
