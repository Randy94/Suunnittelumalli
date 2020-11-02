package Factoryt;

import Komponentit.Case;
import Komponentit.Cpu;
import Komponentit.Cpucooler;
import Komponentit.Gpu;
import Komponentit.Memory;
import Komponentit.Systemboard;
import Main.Component;
import Main.ComponentComposite;

public class IbmFactory implements ComputerFactory{
	@Override
    public ComponentComposite createSystemboard() {
        return new Systemboard(140);
    }

    @Override
    public Component createCpu() {
        return new Cpu(600);
    }

    @Override
    public ComponentComposite createCase() {
        return new Case(100);
    }

    @Override
    public Component createMemory() {
        return new Memory(80);
    }

    @Override
    public Component createCpucooler() {
        return new Cpucooler(50);
    }

    @Override
    public Component createGpu() {
        return new Gpu(500);
    }
}
