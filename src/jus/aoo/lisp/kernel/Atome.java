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
}
