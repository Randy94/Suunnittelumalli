package state;

public interface DigimonStateVisitor {
	public void visit(Agumon agumon);
    public void visit(Greymon greymon);
    public void visit(MetalGreymon MetalGreymon);
}
