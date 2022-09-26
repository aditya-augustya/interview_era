package core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate_elements_given_integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,10,15,8,49,25,15,98,32);
		//convert to SET
		Set<Integer> myset = list.stream().collect(Collectors.toSet());
		System.out.println(myset);
		
	}

}
