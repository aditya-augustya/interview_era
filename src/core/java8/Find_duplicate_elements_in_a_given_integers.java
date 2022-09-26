package core.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_duplicate_elements_in_a_given_integers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		List<String> list = Arrays.asList("Sachin","One", "Two", "Three","Grapes", "Fedor","Mango","Strawberry","Banana","Grapes","Mango","Banana","Apple","Strawberry");
		
				
		Set<String> set = new HashSet<String>() ;
		list.stream().filter(s -> !set.add(s)).collect(Collectors.toSet()).forEach(System.out::println);

	}

}
