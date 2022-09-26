package core.java8;

import java.util.StringJoiner;

public class Explain_StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner stj = new StringJoiner(",", "(", ")");
		stj.add("Saket");
        stj.add("John");
        stj.add("Franklin");
        stj.add("Ricky");
        stj.add("Trevor");
        System.out.println(stj);
		
	}

}
