package core.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Unique_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		List<String> list = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");

	      List<String> subset1 = list.stream()
	                                 .takeWhile(s -> !s.equals("e"))
	                                 .collect(Collectors.toList());
	      System.out.println(subset1);
	      
	      List<String> subset2 = list.stream()
                  .dropWhile(s -> !s.equals("e"))
                  .collect(Collectors.toList());
	      System.out.println(subset2);

	      List<Integer> numbers = Stream.iterate(1, i -> i <= 10, i -> i+1)
		                     .collect(Collectors.toList());
			System.out.println(numbers);
			*/
			
			String exampleString = "This is just a sample string";

	        long totalCharacters = exampleString.chars().filter(ch -> ch != ' ').count();
	        System.out.println("/n " + exampleString.length() + "/t");
		
	}

}
