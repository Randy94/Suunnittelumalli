package Cor;

public class Supervisor extends Accountant {

	public Supervisor(double euro) {
		this.euro = euro;
	}
	
	
	@Override
	protected void handlePayRaise(double newSalary) {
		
		System.out.println("Supervisor has handled your pay raise. Your new salary is: " + newSalary);
		
	}

	@Override
	protected void cantHandle() {
		System.out.println("Supervisor has moved your pay raise issue up the chain.");
		
	}

}
