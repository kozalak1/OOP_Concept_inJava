package interface_;

public interface interface_HybridEngine extends Vehicle {

	String madeIn = "Germany";
	
	void HybridEngine();
	
	void run();
	
	
	public default int power () {
		 
		System.out.println("Hybrid engines are increasing their power");
		
		return 100;
		// Until Java-8; it was impossible to put a concrete methods into an interface. but after, it is possible by using "default" and "static" keyword.
		// CONCRETE METHODS in the interfaces are not mandatory to override by concrete class; for example, Car Class..
	}
	
	public static String model () {
		
		System.out.println("The best model is ....");
		
		return "The best..";
		
	}
	
	
}

