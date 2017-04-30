package jus.aoo.lisp.kernel;

public class Eq extends Fsubr {
	
	public static Eq eq = new Eq();


	public Eq() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		if (argList.car().equals(argList.cdr().car())) {
			return Symbole.newSymbole("t");
		} else {
			return Nil.NIL;
		}
	}

}
