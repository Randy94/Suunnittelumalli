package state;

public class DigimonVisitor implements DigimonStateVisitor {

	@Override
	public void visit(Agumon agumon) {
		System.out.println("You receive 20 speed bonus points!");
		
	}

	@Override
	public void visit(Greymon greymon) {
		System.out.println("\nYou receive 20 attack bonus points!");
		
	}

	@Override
	public void visit(MetalGreymon MetalGreymon) {
		System.out.println("\nYou receive 20 hp bonus points!");
		
	}

	

}
