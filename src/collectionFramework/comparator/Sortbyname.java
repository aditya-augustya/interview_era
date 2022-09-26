package collectionFramework.comparator;

import java.util.Comparator;

public class Sortbyname implements Comparator<EmpoyeeEntity>{

	@Override
	public int compare(EmpoyeeEntity o1, EmpoyeeEntity o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
