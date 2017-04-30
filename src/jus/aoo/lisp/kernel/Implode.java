package jus.aoo.lisp.kernel;

import java.util.ArrayList;

public class Implode extends Subr {
	ArrayList<Sexpr> liste= new ArrayList<>();;

	public static Implode imp = new Implode();
	

	public Implode() {
		// TODO Auto-generated constructor stub
		 
	}
	
	private Sexpr createSexpr(Sexpr t) {
		if (t.isNil()) {
			return Nil.NIL;
		} else {
			return new Scons(t.car(),createSexpr(t.cdr()));
		}
	}
	
	private void insertListe(Sexpr t) {
		if (t.isNil()) {
			liste.add(Nil.NIL);
		} else {
			liste.add(t.car());
			insertListe(t.cdr());
		}
	}

	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		// TODO Auto-generated method stub
		insertListe(argList.car());
		String s = "";
		for (int i =0; i<liste.size()-1; i++) {
			s = s.concat(liste.get(i).toString());		

		}
		return Symbole.newSymbole(s);
	}




}
