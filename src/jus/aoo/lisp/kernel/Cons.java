package jus.aoo.lisp.kernel;

public class Cons extends Subr {

	public static Cons cons = new Cons();


	
	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		
		return new Scons(argList.car(), argList.cdr().car());
	}
}
