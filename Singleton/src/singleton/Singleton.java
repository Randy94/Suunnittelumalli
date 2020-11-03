package singleton;

public class Singleton {
	
	public static void main(String[] args) {
		
        AbstractFactory factory = Vaatefactory.INSTANCE;
        factory.createFarkut();
        factory.createKengät();
        factory.createLippis();
        factory.createTpaita();
      
    }
}
