package jus.aoo.lisp.kernel;

public abstract class Primitive extends Atome implements _Reducer{

	@Override
	public Sexpr reduction(Sexpr fct, Sexpr argList) {
		// TODO Auto-generated method stub
		return apply(fct, evalArgs(argList));
	}
	protected abstract Sexpr evalArgs(Sexpr args);
	

	
	public boolean isPrimitive() {
		return true;
	}
	
	public boolean isAtome() {
		return true;
	}
}
