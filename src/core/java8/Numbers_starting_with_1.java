package core.java8;

import java.util.Arrays;
import java.util.List;

public class Numbers_starting_with_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,10,15,8,49,25,98,32);
		//list.stream().filter(s -> s>9 && s<20).forEach(System.out::println);
		
		List<String> list_arr = Arrays.asList("Sachin","One", "Two", "Three","John", "Fedor","Mango","Apple","Banana","Grapes","Mango","Banana","Apple","Strawberry") ;

		
		list.stream().map(s -> s+ "").filter(s-> s.startsWith("1")).forEach(System.out::println);
		
		list_arr.stream().filter(s -> s.startsWith("S")).forEach(System.out::println);
		list_arr.stream().filter(s -> s.startsWith("S")).findFirst().ifPresent(System.out::println);
	}

}
