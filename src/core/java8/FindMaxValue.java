package core.java8;

import java.util.Arrays;
import java.util.List;

public class FindMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(13,8,14,10,15,8,49,25,98,98,32,15);
		list.stream().max(Integer::compare).ifPresent(System.out::println);
		
	}

}
