package adapter;

public class Main {

	public static void main(String args[]) {
		
		Speed lada = new Lada();
		Speed mustang = new Mustang();
		Speed ferrari = new Ferrari();
		
		AdapterImplement LadaAdapter = new AdapterImplement(lada);
		System.out.print("Ladas top speed is:" + LadaAdapter.getSpeed() + "km/h");
		
		
		AdapterImplement MustangAdapter = new AdapterImplement(mustang);
		System.out.print("\nMustangs top speed is:" + MustangAdapter.getSpeed() + "km/h");
		
		
		AdapterImplement FerrariAdapter = new AdapterImplement(ferrari);
		System.out.print("\nFerraris top speed is:" + FerrariAdapter.getSpeed() + "km/h");
		
		
		
		
		
		
	}
	
	
}
