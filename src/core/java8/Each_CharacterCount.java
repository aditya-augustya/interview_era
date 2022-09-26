package core.java8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Each_CharacterCount {
    public static void main(String args[]) {
    	
        String str = "I mnoiam Aaidi" ;
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        str = scanner.nextLine();
        */
        
        int i, length, counter[] = new int[256];
 
        
 
        length = str.trim().length();
 
        // Count frequency of every character and store
        // it in counter array
        for (i = 0; i < length; i++) {
            counter[(int) str.trim().charAt(i)]++;
        }
        // Print Frequency of characters
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
              //  System.out.println((char) i + " --> " + counter[i]);
            }
        }
        
        String noDuplicates = Arrays.asList(str.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
        
        System.out.println("next  " + noDuplicates.trim());
        
		/*--------------------------------------------*/
        
        char ch[] = noDuplicates.replace(" ", "").toCharArray() ;
        for(char c : ch) {
        	
        	int count=0;
        	  for(int i1=0; i1<str.replace(" ", "").length(); i1++)
        	  {
        	      if(str.charAt(i1) == c)
        	      count++;
        	  }
        	  System.out.println("The Character '"+c+"' appears "+count+" times.");
        	  
        }
        
        
        
        
        
        
        
    }
}