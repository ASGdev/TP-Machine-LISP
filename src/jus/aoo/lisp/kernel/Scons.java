package jus.aoo.lisp.kernel;

public class Scons implements Liste {
	private Sexpr car;
	private Sexpr cdr;
	public Scons(Sexpr s1, Sexpr s2) {
		car = s1;
		cdr = s2;
	}
	
	
	public String toString() {

	 return "("+ toString(this) +")";
	}
	
	public String toString(Sexpr s) {
		if(s.cdr() instanceof  Nil) {return s.car().toString();}
		if (s.cdr() instanceof Atome) {
			return s.car().toString() + " . " + s.cdr().toString();
		}
		
			 return  s.car().toString() + " " + toString(s.cdr());


		}

	public boolean equals(Sexpr s) {
		String s1 = this.toString();
		String s2 = this.toString();
		return(s1.equals(s2));
	}

	
	public Sexpr eval() {
		//try {
			Sexpr fct = car().eval();
			if (fct.isPrimitive()) {return ((_Reducer) fct).reduction(fct, cdr);}
			if (fct.isAtome()) { throw new LispException("fonction incorrecte");}
			if (fct.car().equals(Symbole.newSymbole("lambda"))) {return Expr.expr.reduction(fct, cdr);}
			if (fct.car().equals(Symbole.newSymbole("flambda"))) {return Fexpr.fexpr.reduction(fct, cdr);}
			throw new LispException("eval impossible");

	//	} catch (LispException e) {
		//	System.out.println(e.getMessage());
		//}
	//	return this;

	}


	@Override
	public Sexpr car() {
		// TODO Auto-generated method stub
		return car;
	}


	@Override
	public Sexpr cdr() {
		// TODO Auto-generated method stub
		return cdr;
	}


	@Override
	public boolean isPrimitive() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isAtome() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return false;
	}
}
