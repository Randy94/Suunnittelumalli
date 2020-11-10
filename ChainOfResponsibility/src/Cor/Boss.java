package Cor;

public class Boss extends Accountant {

	public Boss(double euro) {
		this.euro = euro;
	}
	
	
	@Override
	protected void handlePayRaise(double newSalary) {
		System.out.println("The Boss has handled your pay raise. Your new salary is: " + newSalary);
		
	}

	@Override
	protected void cantHandle() {
		System.out.println("The Boss has moved your pay raise issue up the chain.");
		
	}

}
