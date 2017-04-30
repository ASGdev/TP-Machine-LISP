package jus.aoo.lisp.kernel;

public class CDR extends Subr{

	public static CDR cdr = new CDR();
	
	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		
		return argList.car().cdr();
	}


}
