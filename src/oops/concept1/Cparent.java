package oops.concept1;

public class Cparent extends Bparent  {

	public void app() {
		System.out.println("Im from Cparent extends Bparent");
	}
	
	@Override
    void calculate(int a, int b) 
    {
        System.out.println("Class Z");
    }
	
}