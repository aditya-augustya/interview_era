package core.java8;

import java.util.Arrays;
import java.util.List;

public class Find_the_first_element_of_the_list_using_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(13,8,14,10,15,8,49,25,98,98,32,15);
		list.stream().filter(s -> s%2==0).findFirst().ifPresent(System.out::println); /// first even number
		//list.stream().findAny().ifPresent(System.out::println); // first number
		
		List<String> list_str = Arrays.asList("Sachin","One", "Two", "Three","John", "Fedor","Mango","Apple","Banana","Grapes","Mango","Banana","Apple","Strawberry") ;
		list_str.stream().filter(s -> s.startsWith("G")).findFirst().ifPresent(System.out::println);
		
	}

}
