package oops.concept1;

public class Bparent extends Aparent {

	public void app() {
		System.out.println("Im from Bparent extends Aparent");
	}
	
	@Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y " + a + b);
    }
}