package core.java8;

import java.util.Arrays;
import java.util.List;

public class Find_the_first_non_repeated_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Sachin","One", "Apple", "Mango","John", "Fedor","Mango","Apple","Banana","Grapes","Mango","Mango","Apple","One") ;
		String inputStr ="occurrence of a given character in a string whereas method";
		
		for(char i : inputStr.toCharArray()) {
			if(inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println(i);
				break;
			}
		}

	}

}
