package singleton;




public enum Vaatefactory implements AbstractFactory{
	
	INSTANCE;
	@Override
    public void createFarkut() {
        System.out.println("Lee farkut");
    }

    @Override
    public void createTpaita() {
    	System.out.println("Adidas t-paita");
    }

    @Override
    public void createLippis() {
    	System.out.println("Nike lippis");
    }

    @Override
    public void createKeng�t() {
    	System.out.println("Timberlandin keng�t");
    }
}
