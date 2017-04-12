package jus.aoo.lisp.kernel;

import java.util.TreeMap;

public class Symbole extends Atome {
	
	public static TreeMap<String, Symbole> symboles = new TreeMap<String, Symbole>();
	
	public String sym;

	public static Symbole newSymbole(String s) {
		//regarde dans la treemap si le symbole existe deja
		//le créé et l'insere
		//ou le modifi ????
		if(symboles.get(s) == null){
			// add or replace old value
			Symbole symbole = new Symbole(s);
			symboles.put(s, symbole);
			return symbole;
		} else {
			return null;
		}
		
	}
	
	public String getSym() {
		return sym;
	}

	public void setSym(String sym) {
		this.sym = sym;
	}

	private Symbole(String s ){
		sym = s;
	}
	public Sexpr eval() {
		return Context.get(this);
		
	}
	public String toString() {
		return sym;
	}

	@Override
	public Sexpr car() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sexpr cdr() {
		// TODO Auto-generated method stub
		return null;
	}
}
