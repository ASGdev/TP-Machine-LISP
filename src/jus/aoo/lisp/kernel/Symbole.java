package jus.aoo.lisp.kernel;

public class Symbole extends Atome {
	
	public Sexpr eval() {
		return Context.get(this);
		
	}
}
