package core.java8;

import java.util.Arrays;
import java.util.List;
// Given a list of integers, find out all the even numbers exist in the list using Stream functions?

public class Even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		myList.stream().filter(s -> s%2==0).forEach(System.out::println); ;
		
	}

}
