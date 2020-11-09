package state;

public class Greymon extends Digimon{
	private static Greymon INSTANCE = new Greymon();
	private Greymon() {}
	
	public static Greymon State() {
		return INSTANCE;
		
	}
	@Override
	public void trainHp() {
		setHp(getHp() + 100);
		System.out.print("\nGreymon pushed a Giant rock his hp increased: " + getHp());
		
	}

	@Override
	public void trainDmg() {
		setDmg(getDmg() + 100);
		System.out.print("\nGreymon used Mega Flame on local wildlife his attack increased: " + getDmg());
		
	}

	@Override
	public void trainSpeed() {
		setSpeed(getSpeed() + 100);
		System.out.print("\nGreymon chased a local Valtteri his speed increased: " + getSpeed());
		
	}

	@Override
	public void evolve(Monster monster) {
		if(Dmg > 1000 && Hp > 1000 && Speed > 1000) {
			System.out.print("\nGreymon Evolves to Metal Greymon!");
			monster.stateHop(MetalGreymon.State());
			
		}
		
	}




}
