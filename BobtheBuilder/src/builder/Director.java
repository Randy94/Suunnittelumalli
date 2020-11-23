package builder;

public class Director {

	public static void main(String[] args) {
		
		Burger Bigmac = new Mcdonalds("Brioche", "Kobebeef", "Iceberg", "Cheddar").Builburger();
		
		System.out.print("Your Mcdonalds burger contains: " + Bigmac.toString());
		
		
		Bun bun = new Bun("brioche");
		Patty patty = new Patty("Kobebeef");
		Lettuce lettuce = new Lettuce("Iceberg");
		Cheese cheese = new Cheese("Cheddar");
		
		
		Bigmac = new HesburgerBuilder(bun, patty, lettuce, cheese).Builburger();
		System.out.print("\n" + "Your Bigmac contains: "   + Bigmac.toString());
	}
}
