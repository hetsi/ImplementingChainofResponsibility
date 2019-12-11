package chainofresponsibility;

public class Part_Collector extends Employee{
	
	public Part_Collector(int authorityLevel) {
		this.authorityLevel = authorityLevel;
	}
	@Override
	protected void write(String message) {
		System.out.println(message + "all the parts have been gathered");
		
	}
	
	
}
