package interface_;

public class Runner {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.climateAC();
		car1.electronicAC();
		car1.manuelAC();
		car1.HybridEngine();
		car1.run();
		car1.move();          // you can call the method by using the object name
		Vehicle.staticMove(); // by using the object names, you can not access the "static" concrete method. you can call the method by using the interface name
		
		
		System.out.println(interface_AirCondition.madeIn);
		System.out.println(interface_HybridEngine.madeIn);
	}

}
