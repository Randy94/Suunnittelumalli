package Cor;

public class Cto extends Accountant{

	public Cto(double euro) {
		this.euro = euro;
		
	}
	@Override
	protected void handlePayRaise(double newSalary) {
		System.out.println("Cto has handled your pay raise. Your new salary is: " + newSalary);
		
	}

	@Override
	protected void cantHandle() {
		System.out.println("Cto has run out of money.");
		
	}

}
