package jus.aoo.lisp.kernel;

import java.util.TreeMap;

public class Symbole extends Atome {
	
	public static TreeMap<String, Symbole> symboles = new TreeMap<String, Symbole>();
	
	public String sym;

	public static Symbole newSymbole(String s) {
		//regarde dans la treemap si le symbole existe deja
		//le créé et l'insere
		//ou le modifi ????
		if(symboles.get(s) == NULL){
			// add or replace old value
			symboles.put(s, Symbole(s));
			return Symbole(s);
		} else {
			return null;
		}
		
	}
	
	private Symbole(String s ){
		sym = s;
	}
	public Sexpr eval() {
		return Context.get(this);
		
	}
	public String toString() {
		return "Symbole";
	}
}
