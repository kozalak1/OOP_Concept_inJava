package interface_;

public interface interface_AirCondition extends Vehicle {

	// INTERFACE
	
	String madeIn = "Japan"; 
	
	public abstract void climateAC();
	
	public void electronicAC();
	
	void manuelAC();
	
	void run();
	
	// yukarıdaki metod yazılışlarının hepsi mümkündür
	// interface, abstract ı kapsadığı için yazmamıza gerek yoktur
	// access modifier ı yazmazsak default olarak public oldugunu anlar
}
