package core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Find_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		List<String> valueList = new ArrayList<>();
		valueList.add("Joe");
		valueList.add("John");
		valueList.add("Sean");

		Stream<String> stream = valueList.stream();
		stream.reduce((first, second) -> second)
		  .orElse(null);
		
		
		
		
	}

}
