package Main;

import Factoryt.ComputerFactory;
import Factoryt.IbmFactory;
import Komponentit.Case;
import Komponentit.Cpu;
import Komponentit.Cpucooler;
import Komponentit.Gpu;
import Komponentit.Memory;
import Komponentit.Systemboard;
import StoreKomponentit.StoreFactory;

public class Composite {

	
	public static void main(String[] args) {
       
        
        ComponentComposite allComponents = new Case(90);
        ComponentComposite Systemboard = new Systemboard(100);
        Systemboard.addLaiteosa(new Cpu(150.50));
        Systemboard.addLaiteosa(new Memory(25.75));
        Systemboard.addLaiteosa(new Memory(25.75));
        Systemboard.addLaiteosa(new Cpucooler(20));
        Systemboard.addLaiteosa(new Gpu(199.90));
        allComponents.addLaiteosa(Systemboard);
        System.out.println("Price of computer: " + allComponents.getPrice() + " €");
        
       
        ComputerFactory tietokoneTehdas = new StoreFactory();
        ComponentComposite tehdaskokoonpano = tietokoneTehdas.createCase();
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createSystemboard());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createCpu());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMemory());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMemory());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createCpucooler());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createGpu());
        System.out.println("Online store price: " + tehdaskokoonpano.getPrice() + " €");
        
        
        tietokoneTehdas = new IbmFactory();
        tehdaskokoonpano = tietokoneTehdas.createCase();
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createSystemboard());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createCpu());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMemory());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMemory());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createCpucooler());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createGpu());
        System.out.println("Ibm price: " + tehdaskokoonpano.getPrice() + " €");
    }
    
}

