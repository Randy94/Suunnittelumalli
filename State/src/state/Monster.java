package state;

import java.util.concurrent.TimeUnit;

public class Monster implements DigimonInterface {
	private Digimon state;
	private boolean tsekkaus = true;
	@Override
	
	
	public void SuperEvolve() {
		while(tsekkaus == true){
				state.trainDmg();
				state.trainHp();
				state.trainSpeed();
				state.evolve(this);
				
			try {
				
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(tsekkaus == false) {
				System.exit(0);
			}
			
		}	
		
	}
	
	public Monster() {
		this.state = Agumon.State();
	}

	
	public void stateHop(Digimon state) {
		
		this.state = state;
		
	}

	public boolean setTsekkaus(boolean tsekkaus) {
		this.tsekkaus = tsekkaus;
		return tsekkaus;
	}

	

	
	
	
}
