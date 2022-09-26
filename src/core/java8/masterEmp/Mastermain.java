package core.java8.masterEmp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Mastermain {
	
	// https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 4567818000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		
		pro10(employeeList);

	}
	

		public static void pro3(List<Employee> employeeList){
			
			Map<String , Long > _map = employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender, Collectors.counting())) ;
			System.out.println(_map);
		}
	
	
	// 3.1 : How many male and female employees are there in the organization?
	public static void pro1(List<Employee> employeeList){
		
		Map<String,Long> _map = employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender, Collectors.counting())) ;
		System.out.println(_map);
		
	}
	
	// Print the name of all departments in the organization?
	public static void pro2(List<Employee> employeeList){
		
		 employeeList.stream().map(Employee:: getDepartment).distinct().forEach(System.out::println);
		
	}
	
	// What is the average age of male and female employees?
	public static void pro4(List<Employee> employeeList){
		
		Map<String,Double> _map = employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender, Collectors.averagingInt(Employee:: getAge)));
		System.out.println(_map);
		
	}
	
	
	
	//Get the details of highest paid employee in the organization?
	//Use Collectors.maxBy() method which returns maximum element wrapped in an Optional object based on supplied Comparator.
	public static void pro5(List<Employee> employeeList) {
		
		Optional<Employee> highestPaidEmployeeWrapper =
				employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee:: getSalary))) ;
		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
        
		System.out.println("Details Of Highest Paid Employee : ");
		         
		System.out.println("==================================");
		         
		System.out.println("ID : "+highestPaidEmployee.getId());
		         
		System.out.println("Name : "+highestPaidEmployee.getName());
		         
		System.out.println("Age : "+highestPaidEmployee.getAge());
	}
	
	// Get the names of all employees who have joined after 2015?
	/* For such queries which require filtering of input elements, use Stream.filter() method which 
	filters input elements according to supplied Predicate. */
	
	public static void pro6(List<Employee> employeeList) {
		employeeList.stream().filter(s -> s.getYearOfJoining() > 2015).map(Employee:: getName)
		.forEach(System.out::println);
		
	//	Map<String,Optional<Employee>> _map =	employeeList.stream().collect(Collectors.groupingBy(Employee:: getName,Collectors.maxBy(Comparator.comparing(Employee::getYearOfJoining)))) ;
	
	
	}
	
	// Count the number of employees in each department?
	public static void pro7(List<Employee> employeeList) {
		
		Map<String,Long> _map = employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment,Collectors.counting())) ;
		//System.out.println(_map);
		
		Set<Entry<String, Long>> entrySet = _map.entrySet();
        
		for (Entry<String, Long> entry : entrySet)
		{
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
	
	// What is the average salary of each department?
	public static void pro8(List<Employee> employeeList) {
		
		Map<String,Double> _map = 
				employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment,Collectors.averagingDouble(Employee::getSalary))) ;
		//System.out.println(_map);
		
		Set<Entry<String, Double>> entrySet = _map.entrySet();
        
		for (Entry<String, Double> entry : entrySet) 
		{
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
	
	//Get the details of youngest male employee in the product development department?
	//use Stream.filter() method to filter male employees in product development department and to find youngest among them, use Stream.min() method.
	public static void pro9(List<Employee> employeeList) {
		
		employeeList.stream().filter(s -> s.getAge()!= 0)
		.min(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println); 
		
	}
	
	//Who has the most working experience in the organization?
	public static void pro10(List<Employee> employeeList) {
		employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).ifPresent(System.out::println); 
	}
	
	//System.out::println
	
	
	
	
	
	
	

}
