package StoreKomponentit;

import Factoryt.ComputerFactory;
import Main.Component;
import Main.ComponentComposite;

public class StoreFactory implements ComputerFactory {
	 @Override
	    public ComponentComposite createSystemboard() {
	        return new StoreSystemboard();
	    }

	    @Override
	    public Component createCpu() {
	        return new StoreCpu();
	    }

	    @Override
	    public ComponentComposite createCase() {
	        return new StoreCase();
	    }

	    @Override
	    public Component createMemory() {
	        return new StoreMemory();
	    }

	    @Override
	    public Component createCpucooler() {
	        return new StoreCpucooler();
	    }

	    @Override
	    public Component createGpu() {
	        return new StoreGpu();
	    }
}
