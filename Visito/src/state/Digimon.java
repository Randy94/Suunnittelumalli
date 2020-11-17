package state;

import java.lang.Thread.State;

public abstract class Digimon {

	void NextState(Monster monster, Digimon state) {
		monster.stateHop(state);
	}

	
	protected int Hp = 0;
	protected int Dmg = 0;
	protected int Speed = 0;
	
	public int getHp() {
		return Hp;
		
	}
	
	public void setHp(int Hp) {
		this.Hp = Hp;
	}
	public int getDmg() {
		return Dmg;
		
	}
	
	public void setDmg(int Dmg) {
		this.Dmg = Dmg;
	}
	
	public int getSpeed() {
		return Speed;
		
	}
	
	public void setSpeed(int Speed) {
		this.Speed = Speed;
	}
	
	
    public void accept(DigimonStateVisitor visitor) {
    }
	
	public abstract void trainHp();
	
	public abstract void trainDmg();
	
	public abstract void trainSpeed();
	
	public abstract void evolve(Monster monster);
	
}
