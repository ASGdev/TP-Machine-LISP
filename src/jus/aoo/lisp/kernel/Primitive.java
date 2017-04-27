package jus.aoo.lisp.kernel;

public abstract class Primitive extends Atome implements _Reducer{

	@Override
	public Sexpr reduction(Sexpr fct, Sexpr argList) {
		// TODO Auto-generated method stub
		return apply(fct, evalArgs(argList));
	}
	protected abstract Sexpr evalArgs(Sexpr args);
	
	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		try {
			Context.bind(fct.cdr().car(), argList);
			return fct.cdr().cdr().car().eval();
		} finally {
			Context.unbind();
		}
	}
	
}
