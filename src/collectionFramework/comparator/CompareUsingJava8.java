package collectionFramework.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareUsingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmpoyeeEntity> empl = new ArrayList<EmpoyeeEntity>() ;
		
		EmpoyeeEntity empli2 =  new EmpoyeeEntity(12, "bankaj", 2000.00)  ;
		EmpoyeeEntity empli =  new EmpoyeeEntity(10, "arti", 1000.00)  ;
		EmpoyeeEntity empli1 =  new EmpoyeeEntity(11, "zameer", 1600.00)  ;
		
		
		empl.add(empli) ;
		empl.add(empli1) ;
		empl.add(empli2) ;

		Comparator<EmpoyeeEntity> compareByEntyty = Comparator.comparing(e -> e.getName())  ;
		empl.sort(compareByEntyty);
		System.out.println(empl);
		
		
 	}

}
