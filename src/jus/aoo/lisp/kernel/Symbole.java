package jus.aoo.lisp.kernel;

import java.util.TreeMap;

public class Symbole extends Atome {
	
	public static TreeMap<String, Symbole> symboles = new TreeMap<String, Symbole>();
	public static Symbole symbole;
	public static Symbole newSymbole(String s) {
		return null;
	}
	public Sexpr eval() {
		return Context.get(this);
		
	}
	public String toString() {
		return "Symbole";
	}
}
