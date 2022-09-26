package core.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		list.stream().sorted().forEach(System.out::println);
		
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
