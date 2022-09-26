package core.java8;

import java.util.Arrays;
import java.util.List;

public class Find_out_all_the_numbers_starting_with_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,54);
		list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
		
		
	}

}
