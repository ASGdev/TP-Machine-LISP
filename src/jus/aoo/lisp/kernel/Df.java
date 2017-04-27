package jus.aoo.lisp.kernel;

public class Df extends Fsubr {

	public static Df DF = new Df();
	
	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		Context.define((Symbole) argList.car(), new Scons(Symbole.newSymbole("flambda"),argList.cdr()));
		return argList.car();
	}


	
}
