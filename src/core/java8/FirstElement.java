package core.java8;

import java.util.*;
import java.util.stream.*;

public class FirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
         myList.stream()
               .findFirst()
               .ifPresent(System.out::println);
	}

}
