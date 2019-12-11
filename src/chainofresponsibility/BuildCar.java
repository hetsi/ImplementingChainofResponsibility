package chainofresponsibility;

public class BuildCar {
	
	public static void main(String[] args) {
		Employee partcollector = new Part_Collector(Employee.PART_COLLECTOR);
		Employee assembler = new Assembler(Employee.ASSEMBLER);
		Employee welder = new Welder(Employee.WELDER);
		Employee painter = new Painter(Employee.PAINTER);
			
		partcollector.setNextEmployee(assembler);
		assembler.setNextEmployee(welder);
		welder.setNextEmployee(painter);
		
		partcollector.doWork(Employee.PART_COLLECTOR, "Hi ! ");
		
	}
	
			
}


