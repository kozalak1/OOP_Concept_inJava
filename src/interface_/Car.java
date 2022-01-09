package interface_;

public class Car implements interface_AirCondition, interface_HybridEngine {  // implement edilen bütün interfaces leri yanyana yazabiliriz

	// ABSTRACT CLASS'ların interface i tamamen override etme zorunluluğu yok, concrete CLASS ın ise var.
	
	@Override
	public void climateAC() {
		
		System.out.println("An air-condition of the car is climateAC");
		
	}

	@Override
	public void electronicAC() {
		
		System.out.println("An air-condition of the car is electronicAC");
		
	}

	@Override
	public void manuelAC() {
		
		System.out.println("An air-condition of the car is manuelAC");
		
	}

	@Override
	public void HybridEngine() {
		
		System.out.println("The engine of the car is hybrid engine");
		
	}

	@Override 				// interface_AirCondition ve interface_HybridEngine sayfalarından 1 tane metod geldi
	public void run() { 	// parent lardaki metod isimleri aynı olabilir ; ancak return type ları da aynı olmalı
		
		System.out.println("The engine of the car runs good");
		
	}

	

}
