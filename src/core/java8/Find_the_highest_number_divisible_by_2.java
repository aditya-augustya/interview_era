package core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Find_the_highest_number_divisible_by_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,54,103);
		list.stream().filter(s -> s%2==0).max(Integer::compare).ifPresent(System.out::println); 

		list.stream().max(Integer::compare).ifPresent(System.out::println); 
	}

}
