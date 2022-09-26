package core.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Count_occurrences_of_each_character_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am Adi" ;
		
		Map<String, Long> charCount = IntStream.range(0, str.length())
		        .mapToObj(i -> str.substring(i, i + 1))
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(charCount);
		
		
	}

}
