package chainofresponsibility;

public class Painter extends Employee{

		
	public Painter(int authorityLevel) {
		this.authorityLevel = authorityLevel;
	}
	@Override
	protected void write(String message) {
		System.out.println(message + "car complete");
				
	}
}	
	
