package singleton;

public class Singleton {
	
	public static void main(String[] args) {
		
        AbstractFactory factory = Vaatefactory.INSTANCE;
        factory.createFarkut();
        factory.createKeng�t();
        factory.createLippis();
        factory.createTpaita();
      
    }
}
