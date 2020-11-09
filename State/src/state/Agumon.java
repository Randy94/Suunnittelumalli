package state;

public class Agumon extends Digimon {

	private static Agumon INSTANCE = new Agumon();
    
	
	private Agumon() {}
	
	public static Agumon State() {
		return INSTANCE;
		
	}
	
	

	@Override
	public void trainHp() {
		setHp(getHp() + 100);
		System.out.print("\nAgumon pushed a rock his hp increased: " + getHp());
		
	}

	@Override
	public void trainDmg() {
		setDmg(getDmg() + 100);
		System.out.print("\nAgumon used fireball on local wildlife his attack increased: " + getDmg());
		
	}

	@Override
	public void trainSpeed() {
		setSpeed(getSpeed() + 100);
		System.out.print("\nAgumon sprinted to the meat vendor his speed increased: " + getSpeed());
		
	}

	@Override
	public void evolve(Monster monster) {
		if(Dmg > 100 && Hp > 100 && Speed > 100) {
			System.out.print("\nAgumon evolves to Greymon");
				monster.stateHop(Greymon.State());	
			
		}
		
	}

	
}
