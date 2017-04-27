package jus.aoo.lisp.kernel;

public interface _Reducer {

	public Sexpr reduction(Sexpr fct, Sexpr argList);
	
	public Sexpr apply(Sexpr fct, Sexpr argList);
}
