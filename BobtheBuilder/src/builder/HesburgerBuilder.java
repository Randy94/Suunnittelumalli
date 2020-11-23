package builder;

import java.util.List;

public class HesburgerBuilder {

	private List<Object> Burger;
	private Cheese cheese;
	private Patty patty;
	private Bun bun;
	private Lettuce lettuce;
	
	public HesburgerBuilder(Bun bun,Patty patty,Lettuce lettuce,Cheese cheese) {
	
		this.cheese = cheese;
		this.patty = patty;
		this.bun = bun;
		this.lettuce = lettuce;
		
	}
	
	public HesburgerBuilder getBurger() {
		return this;
		
	}
	
	
	public Burger Builburger() {	
		return new Burger(bun.getBun(), patty.getPatty(),lettuce.getLettuce(),cheese.getCheese());
	}
	
}
