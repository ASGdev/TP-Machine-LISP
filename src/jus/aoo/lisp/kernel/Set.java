package jus.aoo.lisp.kernel;

public class Set extends Subr {
	
	public static Set set = new Set();

	public Set() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		// TODO Auto-generated method stub
		Context.bind(argList.car(), argList.cdr().car());
		return Context.get((Symbole)argList.car());
	}

}
