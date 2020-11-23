package builder;

public class Burger {

	
	private String bun = "";
	private String patty = "";
	private String lettuce = "";
	private String cheese = "";
	
	
	public Burger (String bun, String patty, String lettuce, String cheese) {
		
		this.bun = bun;
		this.patty = patty;
		this.lettuce = lettuce;
		this.cheese = cheese;
	}
	
	@Override
	public String toString() {
		
		return "bun:" + bun + "  patty:"+ patty + "  lettuce:" + lettuce + "  cheese:" + cheese;
		
	}
	
	
}
