package Day3_exercise1;

public class CycleClass {
	
	public CycleClass() {}

	public String ride() {
		return "ride";
	}
	
	public static void main(String[] args) {
		
		
		Bicycle bike = new Bicycle();
		UniCycle uni = new UniCycle();
		Tricycle trike = new Tricycle();
		
		CycleClass cycle1 = (CycleClass)bike;
		CycleClass cycle2 = (CycleClass)uni;
		CycleClass cycle3 = (CycleClass)trike;
		
		System.out.println(cycle1.ride());
		System.out.println(cycle2.ride());
		System.out.println(cycle3.ride());
		
	}
}


