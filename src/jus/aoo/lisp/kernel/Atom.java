package jus.aoo.lisp.kernel;

public class Atom extends Fsubr {
	
	public static Atom atom = new Atom();


	public Atom() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		// TODO Auto-generated method stub
		if (argList.car().isAtome()) {
			return Symbole.newSymbole("t");
		} else {
			return Nil.NIL;
		}
	}

}
