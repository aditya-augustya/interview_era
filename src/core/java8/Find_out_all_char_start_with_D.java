package core.java8;

import java.util.Arrays;
import java.util.List;

public class Find_out_all_char_start_with_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = Arrays.asList("Sachin","One", "Two", "Three","John", "Fedor","Mango","Apple","Banana","Grapes","Mango","Banana","Apple","Strawberry") ;

		 list.stream().filter(s -> s.startsWith("S")).forEach(System.out::println);
		 
		 
	}

}
