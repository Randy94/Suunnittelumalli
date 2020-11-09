package state;

public class MetalGreymon extends Digimon{
	private static MetalGreymon INSTANCE = new MetalGreymon();
	public static MetalGreymon State() {
		return INSTANCE;
		
	}
	
	@Override
	public void trainHp() {
		setHp(getHp() + 100);
		System.out.print("\nMetal greymon  pushed a mountain his hp increased: " + getHp());
		
	}

	@Override
	public void trainDmg() {
		setDmg(getDmg() + 100);
		System.out.print("\nMetal greymon used Giga Storm on local wildlife his attack increased: " + getDmg());
		
	}

	@Override
	public void trainSpeed() {
		setSpeed(getSpeed() + 100);
		System.out.print("\nMetal greymon flew across the world his speed increased: " + getSpeed());
		
	}


	@Override
	public void evolve(Monster monster) {
		if(Dmg > 2000 && Hp > 2000 && Speed > 2000) {
			System.out.print("\nMetal Greymon evolves to Greymon");
			monster.setTsekkaus(false);
			
		}
	}





}
