package core.java8;


@FunctionalInterface
public interface FuncItrfs {

	int app(String a) ;
	
	
	
	boolean equals(Object obj);
	
	default void defaultMethod() {
        // default method implementation
    }
	
	static void hello()
    {
        System.out.println("Hello, New Static Method Here");
    }
	
	default String defaultMethod2() {
		
		return null;
        // default method implementation
    }
	
	
  //	Object clone();    Not functional because method Object.clone is not public
	
}
