package jus.aoo.lisp.kernel;

import java.util.ArrayList;

public class Explode extends Subr {
	ArrayList<Sexpr> liste= new ArrayList<>();;
	public static Explode exp = new Explode();
	

	public Explode() {
		// TODO Auto-generated constructor stub
		 
	}
	
	private Sexpr createSexpr() {
		Sexpr s = liste.get(0);
		liste.remove(0);
		if (liste.isEmpty()) {
			return new Scons(s,Nil.NIL);
		} else {
			return new Scons(s,createSexpr());
		}
	}

	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		// TODO Auto-generated method stub
		String s1 = argList.car().toString();
		for (int i=0; i<s1.length(); i++) {
			liste.add(Symbole.newSymbole(String.valueOf(s1.charAt(i))));
			
		}
		return createSexpr();
		
		
	}

}
