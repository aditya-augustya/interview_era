package oops.concept1;


public class ParentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aparent appB = new Bparent() ;  // Im from Bparent extends Aparent
		Aparent appC = new Cparent() ; // Im from Cparent extends Bparent
		
		Bparent b = new Cparent() ;   // Im from Cparent extends Bparent
	 // Bparent bA = new Aparent() ;  // Type mismatch: cannot convert from Aparent to Bparent
	 // Cparent cB = new Bparent() ;  // Type mismatch: cannot convert from Aparent to Bparent
		
		
		// b.app();
		
		Aparent app = new Bparent() ;
		app.calculate(10, 20);
		
		Cparent z = (Cparent) app;
		z.calculate(10, 20);
		
		//java.lang.ClassCastException: class oops.concept1.Bparent cannot be cast to class oops.concept1.Cparent (oops.concept1.Bparent and oops.concept1.Cparent are in unnamed module of loader 'app')
		//at oops.concept1.ParentTest.main(ParentTest.java:22)
		
	}

}
