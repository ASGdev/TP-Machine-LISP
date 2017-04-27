package jus.aoo.lisp.kernel;

public abstract class Atome implements Sexpr {
	public Atome() {
		
	}
	
	public String toString() {
		return "Atome";
	}
	
	
	public Sexpr eval() {
		return null;
	}

@Override
public Sexpr car() {
	// TODO Auto-generated method stub
	throw new LispException("Car non applicable à un atome");
}

@Override
public Sexpr cdr() {
	// TODO Auto-generated method stub
	throw new LispException("Cdr non applicable à un atome");
}
}
