package Factoryt;

import Main.Component;
import Main.ComponentComposite;

public interface ComputerFactory {
	public ComponentComposite createSystemboard();
    public Component createCpu();
    public ComponentComposite createCase();
    public Component createMemory();
    public Component createCpucooler();
    public Component createGpu();
}
