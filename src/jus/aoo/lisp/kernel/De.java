package jus.aoo.lisp.kernel;

public class De extends Fsubr {

	public static De DE = new De();
	
	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		Context.define((Symbole) argList.car(), new Scons(Symbole.newSymbole("lambda"),argList.cdr()));
		return argList.car();
	}


	
}
