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
			return symboles.get(s);
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
		Sexpr s = Context.get(this);
		if (s==null) {
			throw new LispException("L'évaluation n'est pas possible, si vous vouliez évaluer un symbole non connu, ajouter une quote devant ce symbole ou définissez le.");
		} else {
			return s;
		}
		
	}
	public String toString() {
		return sym;
	}
}
