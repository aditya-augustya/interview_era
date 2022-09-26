package collectionFramework.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




public class ComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<EmpoyeeEntity> empl = new ArrayList<EmpoyeeEntity>() ;
		
		EmpoyeeEntity empli2 =  new EmpoyeeEntity(12, "bankaj", 2000.00)  ;
		EmpoyeeEntity empli =  new EmpoyeeEntity(10, "arti", 1000.00)  ;
		EmpoyeeEntity empli1 =  new EmpoyeeEntity(11, "zameer", 1600.00)  ;
		
		
		empl.add(empli) ;
		empl.add(empli1) ;
		empl.add(empli2) ;
		
		//Collections.sort(empl, new SortUsingComparator());
		//System.out.println(empl);
		
		//Collections.sort(empl, new Sortbyname());           // sort by name
		//System.out.println(empl);
		
		
		//Collections.sort(empl, Comparator.comparing( EmpoyeeEntity::getName ).reversed());  // Sort List in Reverse Order
		//System.out.println(empl);
		
		
		
		Comparator<EmpoyeeEntity> groupByComparator = Comparator.comparing(EmpoyeeEntity::getSalary)
                .thenComparing(EmpoyeeEntity::getSalary)
                .thenComparing(EmpoyeeEntity::getId);      // Group By Sorting
		
		Collections.sort(empl, groupByComparator);
		System.out.println(empl);
		
	}

}
