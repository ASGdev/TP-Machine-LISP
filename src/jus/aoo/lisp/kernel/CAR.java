package jus.aoo.lisp.kernel;

public class CAR extends Subr {
	
	
	public static CAR car = new CAR();

	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		
		return argList.car();
	}




}
