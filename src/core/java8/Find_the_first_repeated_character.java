package core.java8;

public class Find_the_first_repeated_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputStr ="occurrence of a given character in a string whereas method";
		
		for(char i : inputStr.toCharArray()) {
			if(inputStr.indexOf(i) != inputStr.lastIndexOf(i)) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
