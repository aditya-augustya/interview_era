package core.java8;
public class CountCharsInString {
    public static void main(String[] args) {

        String exampleString = "This is just a sample string";

        int totalCharacters = 0;
        char temp;
        for (int i = 0; i < exampleString.length(); i++) {

            temp = exampleString.charAt(i);
            if (temp == 'i')
                totalCharacters++;
        }

        System.out.println("i appears " + totalCharacters + " times in exampleString");
    }
}