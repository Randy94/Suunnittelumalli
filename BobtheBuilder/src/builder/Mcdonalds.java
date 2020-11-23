package builder;

public class Mcdonalds {

	
	private String bun = "",patty = "" ,lettuce = "", cheese = "";
    
	
	
	public Mcdonalds(String bun, String patty, String lettuce,String cheese) {
		
		this.cheese = cheese;
		this.patty = patty;
		this.bun = bun;
		this.lettuce = lettuce;	
	}
          
	public Mcdonalds getBurger() {
		return this;
		
	}
	
	public Burger Builburger() {
		
		return new Burger( bun, patty, lettuce, cheese);
	}
	
}
