package interface_;

public class Runner {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.climateAC();
		car1.electronicAC();
		car1.manuelAC();
		car1.HybridEngine();
		car1.run();
		
		System.out.println(interface_AirCondition.madeIn);
		System.out.println(interface_HybridEngine.madeIn);
	}

}
