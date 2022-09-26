package core.java8;

import java.util.Arrays;
import java.util.List;

public class Find_out_all_the_even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,54);
		list.stream().filter(s -> s%2 ==0).forEach(System.out::println);
		
		
	}

}
